package com.example.geoquizgordienko

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

import androidx.activity.ComponentActivity
import androidx.compose.ui.text.toUpperCase
import androidx.core.graphics.toColor
import kotlin.random.Random


class MainActivity: ComponentActivity() {
    private lateinit var textView: TextView
    private lateinit var generateButton: Button
    private lateinit var layout: LinearLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.color_tv)
        generateButton = findViewById(R.id.RandomColors)
        layout = findViewById(R.id.main_layout)

        generateButton.setOnClickListener {
            generateColor()
        }
    }



    @SuppressLint("SetTextI18n")
    @OptIn(ExperimentalStdlibApi::class)
    private fun generateColor() {
        val rnd = Random
        val color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
        layout.setBackgroundColor(color)
        textView.text = "#${color.toHexString()}"
    }

}

