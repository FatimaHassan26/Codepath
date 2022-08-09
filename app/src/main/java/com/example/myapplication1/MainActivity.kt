package com.example.myapplication1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Show this layout file:activity_main
        setContentView(R.layout.activity_main)

        //User can tap a button to change the text color of the label.
        //1. Add a button to our layout

        //Get a reference to button
        //2.Set up logic to know when user has tapped on button
        findViewById<Button>(R.id.button).setOnClickListener {
            //Handles button tap

            Log.i("Fatima","Tapped on Button")
            //Change the color of the text
            //1. Get a reference to the text view
            //2.Set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.orange))
        }
        //User can tap a button to change the color of the background view.
        //1. Add a button to our layout

        //Get a reference to button
        //2.Set up logic to know when user has tapped on button
        findViewById<Button>(R.id.button2).setOnClickListener {
            //Handles button tap
            //Change the color of the text
            Log.i("Fatima","Tapped on Button")
            //Change the color of the background view
            //1. Get a reference to the background view
            //2.Set the color of the background view
            findViewById<ConstraintLayout>(R.id.backgroundView).setBackgroundColor(getResources().getColor(R.color.white))
        }
        //User can enter text into a text field using the keyboard
        findViewById<EditText>(R.id.et_simple).getText().toString()
    }
}