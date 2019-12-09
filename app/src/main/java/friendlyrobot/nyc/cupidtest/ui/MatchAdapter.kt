package friendlyrobot.nyc.cupidtest.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import friendlyrobot.nyc.cupidtest.R
import friendlyrobot.nyc.cupidtest.img.ImageLoader
import friendlyrobot.nyc.cupidtest.model.MatchValue
import friendlyrobot.nyc.cupidtest.model.MatchesModel

class MatchAdapter(private val imageLoader: ImageLoader,
                   private val matchesModel: MatchesModel
) : RecyclerView.Adapter<MatchViewHolder>() {

    private val matches: MutableList<MatchValue> = mutableListOf()

    fun addMatches(matchesToAdd: List<MatchValue>) {
        matches.clear()
        matches.addAll(matchesToAdd)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MatchViewHolder(matchesModel, LayoutInflater.from(parent.context).inflate(R.layout.item_match, parent, false), imageLoader)

    override fun getItemCount() = matches.size

    override fun onBindViewHolder(holder: MatchViewHolder, position: Int) {
        holder.bind(matches.get(position))
    }
}