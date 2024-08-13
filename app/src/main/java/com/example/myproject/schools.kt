package com.example.myproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class schools : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_schools, container, false)

        // Handle Phinma Iloilo logo click
        val phinma_Iloilo: ImageView = view.findViewById(R.id.phinma_iloilo)
        phinma_Iloilo.setOnClickListener {
            findNavController().navigate(R.id.action_schools_to_phinma_iloilo)
        }

        val phinma_Araullo: ImageView = view.findViewById(R.id.phinma_Araullo)
        phinma_Araullo.setOnClickListener{
            findNavController().navigate(R.id.actiom_schools_to_phinma_Araullo)
        }

        val Phinma_Upang: ImageView = view.findViewById(R.id.Phinma_Upang)
        Phinma_Upang.setOnClickListener{
            findNavController().navigate(R.id.actiom_schools_to_phinma_upang)
        }

        val profile: ImageView = view.findViewById(R.id.profile)
        profile.setOnClickListener {
            findNavController().navigate(R.id.action_schools_to_profile)
        }

        return view
    }
}
