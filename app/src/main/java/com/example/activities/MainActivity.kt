package com.example.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener {
            val User_name = editText.text.toString()
            val password = editText2.text.toString()
            Intent(this, Activity2::class.java).also {
                it.putExtra("extra_name", User_name)
                it.putExtra("extra_password", password)
                startActivity(it)
            }
        }
    }
}