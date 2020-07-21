package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var cnt1 = 0
        var cnt2 = 0
        button1.setOnClickListener {
            cnt1++
            count1.text = "$cnt1"
        }
        button2.setOnClickListener {
            cnt2++
            count2.text = "$cnt2"
        }
    }


}
