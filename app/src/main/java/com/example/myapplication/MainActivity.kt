package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("value", et1.text.toString().toInt())
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity3::class.java)
            intent.putExtra("value", et2.text.toString())
            startActivity(intent)
        }
    }


}
