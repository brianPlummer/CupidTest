package friendlyrobot.nyc.cupidtest.img

import android.widget.ImageView
import com.squareup.picasso.Picasso

class ImageLoaderPicasso : ImageLoader {

    override fun loadImage(imageUrl: String, target: ImageView) {
        Picasso.get().load(imageUrl).into(target)
    }
}