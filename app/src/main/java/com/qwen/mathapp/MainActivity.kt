package com.qwen.mathapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //code starts here
        val numberOne = findViewById<EditText>(R.id.edTnumberone)
        val numberTwo = findViewById<EditText>(R.id.edTnumbertwo)
        val solve = findViewById<Button>(R.id.edTbutton)
        val finalAnswer = findViewById<TextView>(R.id.edTanswer)

        solve.setOnClickListener {
            var numberOneString = numberOne.text.toString()
            var numberTwoString = numberTwo.text.toString()
            val numberOneInt: Int
            val numberTwoInt: Int

            //convert into number
            numberOneInt = numberOneString.toInt()
            numberTwoInt = numberTwoString.toInt()

            var Answer = numberOneInt + numberTwoInt
             finalAnswer.text = Answer.toString()
        }//end of equal.setOnClickListener
    }//end of onCreate
}



