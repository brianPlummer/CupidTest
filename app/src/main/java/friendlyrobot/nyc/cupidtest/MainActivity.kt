package friendlyrobot.nyc.cupidtest

import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import friendlyrobot.nyc.cupidtest.img.ImageLoader
import friendlyrobot.nyc.cupidtest.model.DataModel
import friendlyrobot.nyc.cupidtest.model.UIModel
import friendlyrobot.nyc.cupidtest.model.toUIList
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    protected lateinit var imageLoader: ImageLoader

    @Inject
    protected lateinit var searchService: SearchService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as CupidApplication).applicationComponent.inject(this)

        searchService.search().enqueue(object: Callback<DataModel>{
            override fun onFailure(call: Call<DataModel>, t: Throwable) {
                Log.e("Error", "Failure: ${t.localizedMessage}", t)
            }

            override fun onResponse(call: Call<DataModel>, response: Response<DataModel>) {
                Log.e("onResponse", "NumFound: ${response.body()?.data?.size}")
                findViewById<RecyclerView>(R.id.recyclerView)?.apply {

                    addItemDecoration(MarginItemDecoration(resources.getDimension(R.dimen.item_margin).toInt()))
                    layoutManager = GridLayoutManager(this@MainActivity, 2)
                    response.body()?.toUIList()?.let{ adapter = MatchAdapter(it, imageLoader) }

                }
            }
        })
    }
}

class MatchAdapter(private val matches: List<UIModel>, private val imageLoader: ImageLoader) : RecyclerView.Adapter<MatchViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MatchViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_match, parent, false), imageLoader)

    override fun getItemCount() = matches.size

    override fun onBindViewHolder(holder: MatchViewHolder, position: Int) {
        holder.bind(matches.get(position))
    }
}

class MatchViewHolder(view: View, private val imageLoader: ImageLoader) : RecyclerView.ViewHolder(view) {
    fun bind(uiModel: UIModel) {
        imageLoader.loadImage(uiModel.imageUrl, itemView.findViewById(R.id.matchImage))
        itemView.findViewById<TextView>(R.id.matchName).text = uiModel.username
        itemView.findViewById<TextView>(R.id.agePlace).text = uiModel.agePlace
        itemView.findViewById<TextView>(R.id.percentMatch).text = uiModel.match
    }
}

class MarginItemDecoration(private val spaceHeight: Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View,
                                parent: RecyclerView, state: RecyclerView.State) {
        with(outRect) {
            left =  spaceHeight / 2
            right = spaceHeight / 2
            bottom = spaceHeight
        }
    }
}