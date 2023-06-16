package com.omao.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        textView.text = "Hey, I will make it in life!!"

//        val et1: EditText = findViewById(R.id.et1)
        val et1 = findViewById<EditText>(R.id.et1)

        val img1: ImageView = findViewById(R.id.img1)
        img1.setImageResource(R.drawable.bluebird)

        val btn1 = findViewById<Button>(R.id.btn1)
        //Handle the click event on the button
        btn1.setOnClickListener() {
            // execute this code when the button is clicked
            // getting the input from edittext
            val editTextInput: String = et1.text.toString()
            Toast.makeText(this@MainActivity,
                "The button has been clicked by $editTextInput",
                Toast.LENGTH_LONG).show()
        }

    }
}