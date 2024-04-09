package com.example.assignment1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the views
        val ageNumber = findViewById<EditText>(R.id.ageNumber)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnCancel = findViewById<Button>(R.id.btnClear)
        val txtResult = findViewById<TextView>(R.id.txtResult)
           btnGenerate.setOnClickListener {
               val age = ageNumber.text.toString().toIntOrNull()
               if (age != null) {
                   val result = when (age) {
                       in 20..27 -> "Senzo Meyiwa"
                       in 28..35 -> "Lebo Mathosa"
                       in 36..40 -> "Princess Diana"
                       in 41..49 -> "Whitney Houston"
                       in 50..53 -> "Michael Jackson"
                       in 54..60 -> "Luther Vandross"
                       in 61..74 -> "Joe Mafela"
                       in 75..87 -> "Mother Teresa"
                       in 88..95 -> "Mangosuthu Buthelezi"
                       in 96..100 -> "Queen Elizabeth"
                       else -> "none of the above age"
                   }
                   txtResult.text = "Age: $age\n${
                       when (result) {
                           "Senzo Meyiwa" -> "Senzo Meyiwa died at the age of 27."
                           "Lebo Mathosa" -> "Lebo Mathosa died at the age of 29."
                           "Princess Diana" -> "Princess Diana died at the age of 36."
                           "Whitney Houston" -> "Whitney Houston died at the age of 48."
                           "Michael Jackson" -> "Michael Jackson died at the age of 50."
                           "Luther Vandross" -> "Luther Vandross died at the age of 54."
                           "Joe Mafela" -> "Joe Mafela died at the age of 74."
                           "Mother Teresa" -> "Mother Teresa died at the age of 87."
                           "Mangosuthu Buthelezi" -> "Mangosuthu Buthelezi died at the of age 95."
                           "Queen Elizabeth" -> "Queen Elizabeth died at the age of 96."
                           else -> "none of the above"
                       }
                   }"
               } else {
                   txtResult.text = "Please enter a valid age."
               }

               btnCancel.setOnClickListener {
                   ageNumber.text.clear()
                   txtResult.text = ""
               }
           }
    }
}