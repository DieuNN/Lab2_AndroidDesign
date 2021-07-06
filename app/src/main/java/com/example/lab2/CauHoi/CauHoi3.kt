package com.example.lab2.CauHoi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast
import com.example.lab2.MainActivity
import com.example.lab2.R

class CauHoi3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cau_hoi3)

        val chkConfirmed: CheckBox = findViewById(R.id.chkConfirmedCau3)
        val btnSubmit: Button = findViewById(R.id.btnSubmitCauHoi3)
        val correctAnswer: RadioButton = findViewById(R.id.rdoCCau3)
        btnSubmit.isEnabled = false

        chkConfirmed.setOnCheckedChangeListener { _, checked -> let {
            btnSubmit.isEnabled = checked
        }}

        btnSubmit.setOnClickListener {
            if(correctAnswer.isChecked) {
                Toast.makeText(this, "Bạn đã trả lời đúng! Trở về màn hình đầu tiên", Toast.LENGTH_SHORT).show()
                Handler(Looper.getMainLooper()).postDelayed({
                    startActivity(Intent(this, MainActivity::class.java))
                }, 2000)
            } else {
                Toast.makeText(this, "Bạn đã trả lời sai", Toast.LENGTH_SHORT).show()
            }
        }


    }
}