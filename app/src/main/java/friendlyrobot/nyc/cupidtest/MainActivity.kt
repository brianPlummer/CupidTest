package friendlyrobot.nyc.cupidtest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import friendlyrobot.nyc.cupidtest.fragment.MatchPercentFragment
import friendlyrobot.nyc.cupidtest.fragment.SpecialBlendFragment

class MainActivity : AppCompatActivity() {

    private var matchesPagerAdapter: MatchesPagerAdapter? = null
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        matchesPagerAdapter = MatchesPagerAdapter(supportFragmentManager)
        viewPager = findViewById(R.id.pager);
        viewPager?.adapter = matchesPagerAdapter
        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        tabLayout.setupWithViewPager(viewPager)
    }

    override fun onDestroy() {
        viewPager = null
        matchesPagerAdapter = null
        super.onDestroy()
    }
}

class MatchesPagerAdapter(fm: FragmentManager) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int) = when(position) {
        0 -> SpecialBlendFragment()
        1 -> MatchPercentFragment()
        else -> Fragment()
    }

    override fun getCount() = 2

    override fun getPageTitle(position: Int) = when(position) {
        0 -> "SPECIAL BLEND"
        1 -> "MATCH %"
        else -> ""
    }
}


