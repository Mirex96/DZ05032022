package com.example.dz05032022

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Fragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment3_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.textFragment3).text = arguments?.getString(KEY_VIEW_THREE)
    }

    companion object {
        const val KEY_VIEW_THREE = "KEY_VIEW_THREE"
        fun createNewAll(text: String): Fragment3 =
            Fragment3().apply {
                arguments = Bundle().apply {
                    putString(KEY_VIEW_THREE, text)
                }
            }
    }
}