package com.javadesl.myuitest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.javadesl.myuitest.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            buttonLogin.setOnClickListener {
                if (username.text.isNotEmpty() && password.text.length >= 6) {
                    startActivity(Intent(this@MainActivity, WelcomeActivity::class.java))
                } else {
                    loginFailure.visibility = View.VISIBLE
//                    buttonLogin.visibility = View.INVISIBLE
                }
            }

        }
    }
}