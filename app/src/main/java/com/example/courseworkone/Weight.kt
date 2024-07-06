package com.example.courseworkone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class Weight : Fragment() {
    private lateinit var txtWeight:EditText
    private lateinit var btnConverter:Button
    private lateinit var lblAnswer:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_weight, container, false)
        txtWeight=view.findViewById(R.id.txtGrams)
        btnConverter=view.findViewById(R.id.btnWeightConverter)
        lblAnswer=view.findViewById(R.id.lblWeightAnswer)

        btnConverter.setOnClickListener(View.OnClickListener {

            val value:Double=txtWeight.text.toString().toDouble()
            val valueOfMiters:Double=value/1000

            lblAnswer.text=valueOfMiters.toString()
        })
        return view

    }


}