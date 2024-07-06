package com.example.courseworkone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Temparature : Fragment() {

    private lateinit var txtTemp: EditText
    private lateinit var btnConvert: Button
    private lateinit var lblAnswer: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View=inflater.inflate(R.layout.fragment_temparature, container, false)
        txtTemp=view.findViewById(R.id.txtFah)
        btnConvert=view.findViewById(R.id.btnTempAnswer)
        lblAnswer=view.findViewById(R.id.lblTempAnswer)

        btnConvert.setOnClickListener(View.OnClickListener {
            val temp=txtTemp.text.toString().toDouble()
            val ans=(temp-32)*5/9
            lblAnswer.text=ans.toString()
        })
        return view
    }



}