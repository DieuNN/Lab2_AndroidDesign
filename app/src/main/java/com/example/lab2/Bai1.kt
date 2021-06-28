package com.example.lab2

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Bai1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai1)

        var text:TextView = findViewById(R.id.lblBai1)
        text.text = "Fpoly"
        val font:Typeface = Typeface.createFromAsset(assets, "Blazed.ttf")
        text.typeface = font








    }


}