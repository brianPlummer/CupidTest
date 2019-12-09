package friendlyrobot.nyc.cupidtest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import friendlyrobot.nyc.cupidtest.CupidApplication
import friendlyrobot.nyc.cupidtest.R
import friendlyrobot.nyc.cupidtest.img.ImageLoader
import friendlyrobot.nyc.cupidtest.model.MatchValue
import friendlyrobot.nyc.cupidtest.model.MatchesModel
import friendlyrobot.nyc.cupidtest.ui.MarginItemDecoration
import friendlyrobot.nyc.cupidtest.ui.MatchAdapter
import javax.inject.Inject

open class SpecialBlendFragment : Fragment() {

    @Inject
    protected lateinit var imageLoader: ImageLoader

    protected var matchAdapter: MatchAdapter? = null
    protected var matchesModel: MatchesModel? = null
    protected var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_special_blend, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.recyclerView)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        (requireContext().applicationContext as CupidApplication).applicationComponent.inject(this)
        matchesModel = activity?.run {
            ViewModelProviders.of(this)[MatchesModel::class.java]
        } ?: throw Exception("Invalid Activity")
        matchAdapter = MatchAdapter(imageLoader, matchesModel!!)

        recyclerView?.apply {
            addItemDecoration(MarginItemDecoration(resources.getDimension(R.dimen.item_margin).toInt()))
            layoutManager = GridLayoutManager(this@SpecialBlendFragment.context, 2)
            adapter = matchAdapter
        }
        wireUpData()
    }

    open fun wireUpData() {
        matchesModel?.getMatches()?.observe(this, Observer<List<MatchValue>> { matches ->
            matchAdapter?.addMatches(matches)
        })
    }

    override fun onDestroy() {
        recyclerView = null
        matchesModel = null
        matchAdapter = null
        super.onDestroy()
    }
}