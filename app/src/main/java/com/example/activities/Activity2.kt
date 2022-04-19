package com.example.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val User_name = intent.getStringExtra("extra_name")
        val password = intent.getStringExtra("extra_password")
        val user = "your user_name is $User_name , and password is $password"
        tvid.text = user
    }
}