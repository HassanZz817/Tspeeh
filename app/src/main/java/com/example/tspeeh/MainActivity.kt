package com.example.tspeeh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    lateinit var btn : Button
    lateinit var counter : TextView
    lateinit var textView: TextView
    lateinit var viewPager: ViewPager2
    var timesClicked = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViews()


    }
    private fun connectViews(){
        val btn = findViewById<Button>(R.id.btn)
        val texts = listOf(
            R.string.سبحان_الله,
            R.string.استغفر_الله,
            R.string.لا_اله_الا_الله,
            R.string.الحمدلله

        )
      val adapter = ViewPagerAdapter(texts,btn)
        viewPager.adapter = adapter
        val coutner = findViewById<TextView>(R.id.counter)

        btn.setOnClickListener{
            timesClicked += 1

            coutner.text = timesClicked.toString()
        }
    }

}