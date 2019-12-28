package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtNum1=findViewById<EditText>(R.id.edt_num1)
        val edtNum2=findViewById<EditText>(R.id.edt_num2)

        val btnSum=findViewById<Button>(R.id.btn_sum)
        val btnSub=findViewById<Button>(R.id.btn_sub)
        val btnMult=findViewById<Button>(R.id.btn_mult)
        val btnDiv=findViewById<Button>(R.id.btn_div)

        val txtResult : TextView=findViewById(R.id.txt_result)


        btnSum.setOnClickListener {
            var numOne : Int =edtNum1.text.toString().toInt()
            var numTwo : Int=edtNum2.text.toString().toInt()
            var result = numOne+numTwo
            txtResult.text=result.toString()
        }

        btnSub.setOnClickListener {
            var numOne : Int =edtNum1.text.toString().toInt()
            var numTwo : Int=edtNum2.text.toString().toInt()
            var result = numOne-numTwo
            txtResult.text=result.toString()
        }

        btnMult.setOnClickListener {
            var numOne : Int =edtNum1.text.toString().toInt()
            var numTwo : Int=edtNum2.text.toString().toInt()
            var result = numOne*numTwo
            txtResult.text=result.toString()
        }

        btnDiv.setOnClickListener {
            var numOne : Int =edtNum1.text.toString().toInt()
            var numTwo : Int=edtNum2.text.toString().toInt()
            var result = numOne/numTwo
            txtResult.text=result.toString()
        }
    }
}
