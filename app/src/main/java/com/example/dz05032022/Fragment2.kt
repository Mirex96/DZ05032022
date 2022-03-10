package com.example.dz05032022

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView



class Fragment2 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment2_layout, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.textFragment2).text = arguments?.getString(KEY_VIEW_TWO)
    }

    companion object {
        private const val KEY_VIEW_TWO = "KEY_VIEW_TWO"
        fun createNew(text: String): Fragment2 =
            Fragment2().apply {
                arguments = Bundle().apply {
                    putString(KEY_VIEW_TWO, text)
                }
            }
    }


}


