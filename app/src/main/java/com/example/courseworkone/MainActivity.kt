package com.example.courseworkone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

    private lateinit var btnDistance:Button
    private lateinit var btnTemperature:Button
    private lateinit var btnWeight:Button
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDistance=findViewById(R.id.btnKM)
        btnTemperature=findViewById(R.id.btnTemp)
        btnWeight=findViewById(R.id.btnWeight)
        val fragmentContainer= R.id.mainFragment

        btnDistance.setOnClickListener(View.OnClickListener {
            val fragmentManager: FragmentManager =supportFragmentManager

            val fragmentTrans: FragmentTransaction =fragmentManager.beginTransaction()
            val fragment:Miters= Miters()
            fragmentTrans.replace(fragmentContainer,fragment)
            fragmentTrans.commit()
        })

        btnTemperature.setOnClickListener(View.OnClickListener {
            val fragmentManager: FragmentManager =supportFragmentManager

            val fragmentTrans: FragmentTransaction =fragmentManager.beginTransaction()
            val fragment:Temparature= Temparature()
            fragmentTrans.replace(fragmentContainer,fragment)
            fragmentTrans.commit()
        })

        btnWeight.setOnClickListener(View.OnClickListener {
            val fragmentManager: FragmentManager =supportFragmentManager

            val fragmentTrans: FragmentTransaction =fragmentManager.beginTransaction()
            val fragment:Weight=Weight()
            fragmentTrans.replace(fragmentContainer,fragment)
            fragmentTrans.commit()
        })
    }
}