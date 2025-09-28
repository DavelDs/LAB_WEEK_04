package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class CafeAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    // Jumlah tab = 3 (Starbucks, Janji Jiwa, Kopi Kenangan)
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> CafeDetailFragment.newInstance("Starbucks Corporation is an American multinational chain of coffeehouses and roastery reserves headquartered in Seattle, Washington. It is the world's largest coffeehouse chain.")
            1 -> CafeDetailFragment.newInstance("It is undeniable that Janji Jiwa outlets have spread to various corners. Janji Jiwa is a local coffee brand that is popular among students, students, workers and even families. Carrying the jargon \"coffee from the heart\", Janji Jiwa is committed to serving coffee with a classic taste for coffee lovers.")
            2 -> CafeDetailFragment.newInstance("At Kopi Kenangan, their dream is to serve high quality coffee, made with the freshest local ingredients to customers across Indonesia - and the rest of the world")
            else -> CafeDetailFragment.newInstance("No description available.")
        }
    }
}
