package friendlyrobot.nyc.cupidtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import friendlyrobot.nyc.cupidtest.img.ImageLoader
import friendlyrobot.nyc.cupidtest.model.MatchValue
import friendlyrobot.nyc.cupidtest.model.MatchesModel
import friendlyrobot.nyc.cupidtest.ui.MarginItemDecoration
import friendlyrobot.nyc.cupidtest.ui.MatchAdapter
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    protected lateinit var imageLoader: ImageLoader

    protected lateinit var matchAdapter: MatchAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as CupidApplication).applicationComponent.inject(this)

        val matchesModel = ViewModelProviders.of(this)
            .get(MatchesModel::class.java)
        matchAdapter = MatchAdapter(imageLoader, matchesModel)

        findViewById<RecyclerView>(R.id.recyclerView)?.apply {
            addItemDecoration(MarginItemDecoration(resources.getDimension(R.dimen.item_margin).toInt()))
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = matchAdapter
        }

        matchesModel.getMatches().observe(this, Observer<List<MatchValue>> { matches ->
            matchAdapter.addMatches(matches)
        })
    }
}
