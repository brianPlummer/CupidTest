package friendlyrobot.nyc.cupidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import friendlyrobot.nyc.cupidtest.img.ImageLoader
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    protected lateinit var imageLoader: ImageLoader

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as CupidApplication).applicationComponent.inject(this)

        imageLoader.loadImage("https://k2.okccdn.com/php/load_okc_image.php/images/0x0/120x120/36x36/684x684/0/15743311334557165678.jpg",
            findViewById<ImageView>(R.id.imageTest))
    }
}
