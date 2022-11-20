package com.example.tspeeh

import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle)
    : FragmentStateAdapter(fragmentManager, lifecycle) {
    val fragmentList:ArrayList<Fragment> = ArrayList()
        val fragmentTitles:ArrayList<String> = ArrayList()
    lateinit var fragmentButton: Button
    lateinit var counter: TextView


    override fun getItemCount(): Int {
       return fragmentList.size
    }
    override fun createFragment(position: Int): Fragment {
       return fragmentList.get(position)
    }
    fun addFragment(fragment: Fragment, title: String, button: Button,counter: TextView){
        fragmentList.add(fragment)
        fragmentTitles.add(title)
        fragmentButton = button
        this.counter = counter
    }
}