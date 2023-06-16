package com.omao.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        textView.text = "Hey, I am trying to make it in life"

//        val et1: EditText = findViewById(R.id.et1)
        val et1 = findViewById<EditText>(R.id.et1)

        // getting the input from edittext
        val editTextInput: String = et1.text.toString()

    }
}