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


// =IF(LEFT(RIGHT(B3;4);2)="L2";INDEX(BANG_GIA!$C$4:$E$7;MATCH(MAIN_DATA!F3;BANG_GIA!$B$4:$B$7;0);MATCH("SÔNG HỒNG";BANG_GIA!$C$3:$E$3));INDEX(BANG_GIA!$C$4:$E$7;MATCH(MAIN_DATA!F3;BANG_GIA!$B$4:$B$7;0);MATCH("SÔNG HỒNG";BANG_GIA!$C$3:$E$3))/1,5)





    }


}
