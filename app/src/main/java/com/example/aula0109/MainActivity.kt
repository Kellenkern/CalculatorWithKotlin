package com.example.aula0109

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etxtNumber1 = findViewById<EditText>(R.id.etxtNumber1)
        val etxtNumber2 = findViewById<EditText>(R.id.etxtNumber2)
        val btnSum = findViewById<Button>(R.id.btnSum)
        val btnSub = findViewById<Button>(R.id.btnSub)
        val btnMult = findViewById<Button>(R.id.btnMult)
        val btnDiv = findViewById<Button>(R.id.btnDiv)
        val txtResp = findViewById<TextView>(R.id.txtResp)
        val btnClean = findViewById<Button>(R.id.btnClean)

        // Calcs:
        btnSum.setOnClickListener(){
            if(etxtNumber1.text.isNotEmpty() && etxtNumber2.text.isNotEmpty()){
                val number1 = etxtNumber1.text.toString().toFloat()
                val number2 = etxtNumber2.text.toString().toFloat()
                val sum = number1 + number2
                txtResp.setText(sum.toString())
            } else {
                val msg: String = "É preciso digitar os dois números."
                Toast.makeText(applicationContext, msg, LENGTH_SHORT).show()
            } //End if
        } // End onClick Sum

        btnSub.setOnClickListener(){
            if(etxtNumber1.text.isNotEmpty() && etxtNumber2.text.isNotEmpty()){
                val number1 = etxtNumber1.text.toString().toFloat()
                val number2 = etxtNumber2.text.toString().toFloat()
                val sub = number1 - number2
                txtResp.setText(sub.toString())
            } else {
                val msg: String = "É preciso digitar os dois números."
                Toast.makeText(applicationContext, msg, LENGTH_SHORT).show()
            } //End if
        } //End onClick Sub

        btnMult.setOnClickListener(){
            if(etxtNumber1.text.isNotEmpty() && etxtNumber2.text.isNotEmpty()){
                val number1 = etxtNumber1.text.toString().toFloat()
                val number2 = etxtNumber2.text.toString().toFloat()
                val mult = number1 * number2
                txtResp.setText(mult.toString())
            } else {
                val msg: String = "É preciso digitar os dois números."
                Toast.makeText(applicationContext, msg, LENGTH_SHORT).show()
            } //End if
        } // End onclick Mult

        btnDiv.setOnClickListener(){
            if(etxtNumber1.text.isNotEmpty() && etxtNumber2.text.isNotEmpty()){
                val number1 = etxtNumber1.text.toString().toFloat()
                val number2 = etxtNumber2.text.toString().toFloat()
                val div = number1 / number2
                txtResp.setText(div.toString())
            } else {
                val msg: String = "É preciso digitar os dois números."
                Toast.makeText(applicationContext, msg, LENGTH_SHORT).show()
            } //End if
        } // End onClick Div

        //Clean the textViews
        btnClean.setOnClickListener(){
            etxtNumber1.text.clear()
            etxtNumber2.text.clear()
            txtResp.setText(" ")
            etxtNumber1.requestFocus()
        } //End onClick Clean

    }//OnCriate End
}//MainActivity End