package com.example.dz05032022

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Fragment1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment1_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.textFragment1).text = arguments?.getString(KEY_VIEW_ONE)
    }

    companion object {
        private const val KEY_VIEW_ONE = "KEY_VIEW_ONE"
        fun create(text: String): Fragment1 =
            Fragment1().apply {
                arguments = Bundle().apply {
                    putString(KEY_VIEW_ONE, text)
                }
            }
    }

}