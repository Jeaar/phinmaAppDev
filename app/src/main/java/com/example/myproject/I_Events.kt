package com.example.myproject

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.TextView
import androidx.fragment.app.Fragment
import java.text.SimpleDateFormat
import java.util.*

class I_Events : Fragment() {

    private lateinit var calendarView: CalendarView

    private val eventsMap = mapOf(
        "11/6/2024" to "English Fest",
        "11/7/2024" to "Tourism Day",
        "11/8/2024" to "Testimonial and CEA Mustahan",
        "12/5/2024" to "Lamparaan",
        "12/9/2024" to "Ningning Project",
        "12/12/2024" to "Lingapwika Community"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_i__events, container, false)

        calendarView = view.findViewById(R.id.datePicker)

        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            val date = Calendar.getInstance().apply {
                set(year, month, dayOfMonth)
            }
            val formattedDate = SimpleDateFormat("M/d/yyyy", Locale.getDefault()).format(date.time)
            val event = eventsMap[formattedDate]

            showEventDialog(event)
        }

        return view
    }

    private fun showEventDialog(event: String?) {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Event Details")
        builder.setMessage(event ?: "No events on this date.")
        builder.setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss()
        }
        val dialog = builder.create()
        dialog.show()
    }
}
