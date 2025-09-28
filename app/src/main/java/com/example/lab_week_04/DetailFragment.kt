package com.example.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {
    private var coffeeId: Int = 0
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        coffeeId = arguments?.getInt(ListFragment.COFFEE_ID) ?: 0
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detail, container, false)

        val titleTextView = view.findViewById<TextView>(R.id.coffee_title)
        val descTextView = view.findViewById<TextView>(R.id.coffee_desc)

        when (coffeeId) {
            R.id.affogato -> {
                titleTextView.text = getString(R.string.affogato_title)
                descTextView.text = getString(R.string.affogato_desc)
            }
            R.id.americano -> {
                titleTextView.text = getString(R.string.americano_title)
                descTextView.text = getString(R.string.americano_desc)
            }
            R.id.latte -> {
                titleTextView.text = getString(R.string.latte_title)
                descTextView.text = getString(R.string.latte_desc)
            }
            else -> {
                // fallback
                titleTextView.text = getString(R.string.affogato_title)
                descTextView.text = getString(R.string.affogato_desc)
            }
        }
        return view
    }
}
