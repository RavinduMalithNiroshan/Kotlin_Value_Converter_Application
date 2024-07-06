package com.example.courseworkone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class Miters : Fragment() {

    private lateinit var txtKiloMeter:EditText
    private lateinit var btnConvert:Button
    private lateinit var lblAnswer:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view:View = inflater.inflate(R.layout.fragment_miters, container, false)
        txtKiloMeter=view.findViewById(R.id.txtKiloMeter)
        lblAnswer=view.findViewById(R.id.lblFinalAns)
        btnConvert=view.findViewById(R.id.btnMilesConverter)

        btnConvert.setOnClickListener(View.OnClickListener {

            val value:Double=txtKiloMeter.text.toString().toDouble()
            val valueOfMiters:Double=value*1000

            lblAnswer.text=valueOfMiters.toString()
        })
        return view
    }


}