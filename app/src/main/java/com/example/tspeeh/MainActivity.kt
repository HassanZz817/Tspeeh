package com.example.tspeeh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button
    lateinit var counter : TextView
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn)
        var timesClicked = 0
        val textView = findViewById<TextView>(R.id.textView)
        val coutner = findViewById<TextView>(R.id.counter)
        btn.setOnClickListener{
            timesClicked = timesClicked + 1
            if (timesClicked == 100){
                textView.text = "سبحان الله"
            }
            coutner.text = timesClicked.toString()
        }
    }

}