package friendlyrobot.nyc.cupidtest.img

import android.widget.ImageView

interface ImageLoader{
    fun loadImage(imageUrl: String, target: ImageView)
}

