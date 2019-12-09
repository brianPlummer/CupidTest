package friendlyrobot.nyc.cupidtest.ui

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MarginItemDecoration(private val spaceHeight: Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(outRect: Rect, view: View,
                                parent: RecyclerView, state: RecyclerView.State) {
        with(outRect) {
            left =  spaceHeight / 2
            right = spaceHeight / 2
            bottom = spaceHeight
            top = spaceHeight / 2
        }
    }
}