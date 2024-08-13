package com.example.myproject

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Log_In : Fragment() {

    private lateinit var studentNumberEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_log__in, container, false)

        studentNumberEditText = view.findViewById(R.id.id_number)
        passwordEditText = view.findViewById(R.id.password)
        loginButton = view.findViewById(R.id.log_In)

        loginButton.isEnabled = false // Initially disable the button

        // Add text change listeners to both EditTexts
        val textWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val studentNumber = studentNumberEditText.text.toString().trim()
                val password = passwordEditText.text.toString().trim()
                loginButton.isEnabled = studentNumber.isNotEmpty() && password.isNotEmpty()
            }

            override fun afterTextChanged(s: Editable?) {}
        }

        studentNumberEditText.addTextChangedListener(textWatcher)
        passwordEditText.addTextChangedListener(textWatcher)

        loginButton.setOnClickListener {
            // Ensure that the fields are still non-empty when the button is clicked
            val studentNumber = studentNumberEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (studentNumber.isNotEmpty() && password.isNotEmpty()) {
                findNavController().navigate(R.id.action_log_In_to_schools)
            }
        }

        return view
    }
}
