package com.example.myproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import android.widget.TextView

class profile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)

        // Set up the clickable text to navigate to About Us
        val textAboutUs: TextView = view.findViewById(R.id.text_about_us)
        textAboutUs.setOnClickListener {
            findNavController().navigate(R.id.action_profile_to_about_us)
        }


        return view
    }
}
