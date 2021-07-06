package com.example.lab2.CauHoi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.*
import com.example.lab2.R

class Bai5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai5)


        val dapAnABai1: RadioButton = findViewById(R.id.rdoACau1)

        val xacNhanBai1:CheckBox = findViewById(R.id.chkConfirmedCau1)
        val btnTraLoi: Button = findViewById(R.id.btnSubmitCauHoi1)

        if(!xacNhanBai1.isChecked) {
            btnTraLoi.isEnabled = false
        }

        xacNhanBai1.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { _, isChecked ->
            let {
                btnTraLoi.isEnabled = isChecked
            }
        })

        btnTraLoi.setOnClickListener {
            if(dapAnABai1.isChecked) {

                Toast.makeText(this, "Bạn đã trả lời chính xác, đang chuyển sang câu hỏi tiếp theo!", Toast.LENGTH_SHORT).show()

                //startActivity in 2000ms
                Handler(Looper.getMainLooper()).postDelayed({
                    startActivity(Intent(this, CauHoi2::class.java))
                }, 2000)

            } else {
                Toast.makeText(this, "Bạn đã trả lời sai, hãy chọn đáp án khác", Toast.LENGTH_SHORT).show()
            }
        }

    }
}