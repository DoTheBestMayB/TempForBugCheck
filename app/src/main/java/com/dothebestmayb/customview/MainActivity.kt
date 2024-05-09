package com.dothebestmayb.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dothebestmayb.customview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setListener()
    }

    private fun setListener() {
        binding.btnAddSquare.setOnClickListener {
            binding.drawingPaper
        }
    }
}