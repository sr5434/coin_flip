package com.example.coinflipper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.flip)
        var state: Int
        button.setOnClickListener {
            // Do something in response to button click
            state = (1..2).random()
            if (state == 1){
                val textView = findViewById<TextView>(R.id.textView2)
                textView.setText(R.string.coin_heads).toString()
            }
            else {
                val textView = findViewById<TextView>(R.id.textView2)
                textView.setText(R.string.coin_tails).toString()
            }
        }
    }
}
