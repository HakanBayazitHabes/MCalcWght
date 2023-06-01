package com.hakanbayazithabes.mcalcwght

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.hakanbayazithabes.mcalcwght.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    fun onDigit(view: View) {
        binding.tvInput.append((view as Button).text)
    }

    fun onClear(view: View) {
        binding.tvInput.text = ""
    }
}