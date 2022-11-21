package com.example.tspeeh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.tspeeh.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var tabLayout: TabLayout
    lateinit var btn : Button
    lateinit var counter : TextView
    lateinit var textView: TextView
    lateinit var viewPager: ViewPager2
    lateinit var binding: ActivityMainBinding
    var timesClicked = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        connectViews()
        prepareTabs()


    }
    private fun connectViews(){
       tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

    }

    private fun prepareTabs(){

        val fragmentAdapter:FragmentAdapter = FragmentAdapter(supportFragmentManager,lifecycle)
        fragmentAdapter.addFragment(Firstfragment(),"الاول", )
        fragmentAdapter.addFragment(Seconed(),"الثاني",)

        viewPager.adapter = fragmentAdapter
        TabLayoutMediator(tabLayout!!,viewPager!!){
            tab,position -> tab.text = fragmentAdapter.fragmentTitles[position]

        }.attach()
    }


}