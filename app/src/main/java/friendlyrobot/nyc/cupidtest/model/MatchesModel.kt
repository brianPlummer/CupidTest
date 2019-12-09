package friendlyrobot.nyc.cupidtest.model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import friendlyrobot.nyc.cupidtest.di.CupidApplication
import friendlyrobot.nyc.cupidtest.network.SearchService
import kotlinx.coroutines.*
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class MatchesModel (application: Application) : AndroidViewModel(application), CoroutineScope {

    override val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Main
    private var parentJob = Job()

    @Inject
    protected lateinit var searchService: SearchService

    @Inject
    protected lateinit var matchDao: MatchDao

    init {
        (application as CupidApplication).applicationComponent.inject(this)
    }

    private val matches: MutableLiveData<List<MatchValue>> by lazy {
        MutableLiveData<List<MatchValue>>().also {
            loadMatches()
        }
    }

    fun getMatches(): LiveData<List<MatchValue>> {
        return matches
    }

    fun update(matchValue: MatchValue) {
        launch(Dispatchers.IO) {
            matchDao.update(matchValue)
            val uiMatches = matchDao.getAll()
            withContext(Dispatchers.Main) {
                matches.postValue(uiMatches)
            }
        }
    }

    private fun loadMatches() {
        launch(Dispatchers.IO) {
            val response = searchService.search()
            if (response.isSuccessful) {
                response.body()?.toMatchValueList()?.let { matchDao.saveAll(it) }
                val uiMatches = matchDao.getAll()
                withContext(Dispatchers.Main) {
                    matches.postValue(uiMatches)
                }
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        parentJob.cancel()
    }
}