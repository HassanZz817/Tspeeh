package com.example.tspeeh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    lateinit var btn : Button
    lateinit var counter : TextView
    lateinit var textView: TextView
    lateinit var viewPager: ViewPager2
    var timesClicked = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectViews()
        prepareTabs()


    }
    private fun connectViews(){
       tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        btn = findViewById(R.id.btn1)

        var timesClicked = 0
        val counter = findViewById<TextView>(R.id.counter)

        btn.setOnClickListener{
            timesClicked += 1

            counter.text = timesClicked.toString()
        }
    }

    private fun prepareTabs(){

        val fragmentAdapter:FragmentAdapter = FragmentAdapter(supportFragmentManager,lifecycle)
        fragmentAdapter.addFragment(Firstfragment(),"الاول", button = btn,counter)
        fragmentAdapter.addFragment(Seconed(),"الثاني", button = btn,counter)

        viewPager.adapter = fragmentAdapter
        TabLayoutMediator(tabLayout!!,viewPager!!){
            tab,position -> tab.text = fragmentAdapter.fragmentTitles[position]

        }.attach()
    }


}