package com.example.lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.lab2.CauHoi.Bai5
import com.example.lab2.quanLySanPhamActivity.ThemNhanVien
import com.example.lab2.quanLySanPhamActivity.ThemSanPham

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bai1:Button = findViewById(R.id.btnBai1)
        bai1.setOnClickListener {
            startActivity(Intent(this, Bai1::class.java))
        }

        val bai2:Button = findViewById(R.id.btnBai2)
        bai2.setOnClickListener {
            startActivity(Intent(this, Bai2::class.java))
        }

        val bai3:Button = findViewById(R.id.btnBai3)
        bai3.setOnClickListener {
            startActivity(Intent(this, Bai3::class.java))
        }

        val bai4:Button = findViewById(R.id.btnBai4)
        bai4.setOnClickListener {
            startActivity(Intent(this, Bai4::class.java))
        }

        val bai5:Button = findViewById(R.id.btnBai5)
        bai5.setOnClickListener {
            startActivity(Intent(this, Bai5::class.java))
        }

        val themNhanVien:Button = findViewById(R.id.btnThemNhanVien)
        themNhanVien.setOnClickListener {
            startActivity(Intent(this, ThemNhanVien::class.java))
        }

        val themSanPham:Button = findViewById(R.id.btnThemSanPham)
        themSanPham.setOnClickListener {
            startActivity(Intent(this, ThemSanPham::class.java))
        }
    }
}