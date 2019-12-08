package friendlyrobot.nyc.cupidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import friendlyrobot.nyc.cupidtest.img.ImageLoader
import friendlyrobot.nyc.cupidtest.model.DataModel
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

        imageLoader.loadImage("https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/36x36/684x684/0/15743311334557165678.jpg",
            findViewById<ImageView>(R.id.imageTest))

        searchService.search().enqueue(object: Callback<DataModel>{
            override fun onFailure(call: Call<DataModel>, t: Throwable) {
                Log.e("Error", "Failure: ${t.localizedMessage}", t)
            }

            override fun onResponse(call: Call<DataModel>, response: Response<DataModel>) {
                Log.e("onResponse", "NumFound: ${response.body()?.data?.size}")
                //response.body()?.toUIList()
            }
        })
    }
}
