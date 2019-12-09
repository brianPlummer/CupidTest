package friendlyrobot.nyc.cupidtest.fragment

import androidx.lifecycle.Observer
import friendlyrobot.nyc.cupidtest.model.MatchValue

class MatchPercentFragment : SpecialBlendFragment() {
    override fun wireUpData() {
        matchesModel?.getMatches()?.observe(this, Observer<List<MatchValue>> { matches ->
            matchAdapter?.addMatches(matches.filter { it.selected }.take(6))
        })
    }
}
