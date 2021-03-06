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
import com.example.lab2.R

class CauHoi2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cau_hoi2)


        //D is correct answer
        val chkConfirmed: CheckBox = findViewById(R.id.chkConfirmedCau3)
        val btnSubmit: Button = findViewById(R.id.btnSubmitCauHoi3)
        val correctAnswer: RadioButton = findViewById(R.id.rdoCCau2)

        btnSubmit.isEnabled = false

        chkConfirmed.setOnCheckedChangeListener { _, checked -> let {
            btnSubmit.isEnabled = checked
        }}

        btnSubmit.setOnClickListener {
            if(correctAnswer.isChecked) {
                Toast.makeText(this, "Bạn đã trả lời đúng! Chuyển sang câu hỏi tiếp theo!", Toast.LENGTH_SHORT).show()

                Handler(Looper.getMainLooper()).postDelayed({
                    startActivity(Intent(this, CauHoi3::class.java))
                }, 2000)
            } else {
                Toast.makeText(this, "Bạn đã trả lời sai! Hãy chọn đáp án khác!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}