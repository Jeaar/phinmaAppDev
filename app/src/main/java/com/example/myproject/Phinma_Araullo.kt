package com.example.myproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class Phinma_Araullo : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phinma__araullo, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val mapbtn: Button = view.findViewById(R.id.mapbtn)
        mapbtn.setOnClickListener {
            findNavController().navigate(R.id.action_phinma_Araullo_to_p_a_map)
        }

        val scholarshipbtn: Button = view.findViewById(R.id.scholarshipbtn)
        scholarshipbtn.setOnClickListener{
            findNavController().navigate(R.id.action_phinma_Araullo_to_PA_Scholarship)
        }
    }
}