package friendlyrobot.nyc.cupidtest.ui

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import friendlyrobot.nyc.cupidtest.R
import friendlyrobot.nyc.cupidtest.img.ImageLoader
import friendlyrobot.nyc.cupidtest.model.MatchValue
import friendlyrobot.nyc.cupidtest.model.MatchesModel

class MatchViewHolder(private val matchesModel: MatchesModel, view: View, private val imageLoader: ImageLoader) : RecyclerView.ViewHolder(view) {
    fun bind(matchValue: MatchValue) {
        imageLoader.loadImage(matchValue.imageUrl, itemView.findViewById(R.id.matchImage))
        itemView.findViewById<TextView>(R.id.matchName).text = matchValue.username
        itemView.findViewById<TextView>(R.id.agePlace).text = "${matchValue.age} \u2022 ${matchValue.city}, ${matchValue.state}"
        itemView.findViewById<TextView>(R.id.percentMatch).text = "47% Match"//

        val notSelectd = ContextCompat.getColor(itemView.context, android.R.color.white)
        val selected = ContextCompat.getColor(itemView.context, R.color.backgroundSelected)
        val color = if (matchValue.selected) selected else notSelectd
        itemView.findViewById<CardView>(R.id.cardView).setCardBackgroundColor(color)
        itemView.setOnClickListener {
            matchesModel.update(matchValue.copy(selected = !matchValue.selected))
        }
    }
}