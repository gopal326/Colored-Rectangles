package com.example.colorrectangles

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // colors: 1=White, 2=Red, 3=Blue, 4=Yellow, 5=Green, 6=purple, 7=grey, 8=orange
        var button1color:Int=1
        var button2color:Int=1
        var button3color:Int=3
        var button4color:Int=2
        var button5color:Int=1
        var button6color:Int=4

        // set on click listener for each button
        findViewById<Button>(R.id.button1).setOnClickListener {
            button1color=changeColor(it,button1color)
        }
        findViewById<Button>(R.id.button2).setOnClickListener {
            button2color=changeColor(it,button2color)
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            button3color=changeColor(it,button3color)
        }
        findViewById<Button>(R.id.button4).setOnClickListener {
            button4color=changeColor(it,button4color)
        }
        findViewById<Button>(R.id.button5).setOnClickListener {
            button5color=changeColor(it,button5color)
        }
        findViewById<Button>(R.id.button6).setOnClickListener {
            button6color=changeColor(it,button6color)
        }
    }


    private fun changeColor(view: View, buttonColor:Int):Int{
        var buttonxColor=buttonColor
        buttonxColor+=1
        if(buttonxColor>=8)
            buttonxColor=0

        val listOfColors = mutableListOf<String>("#FEFEFE","#D72419","#007FC7","#FECE06","#2ECC71",
        "#9B59B6","#AAB7B8","#E67E22")

        view.setBackgroundColor(Color.parseColor(listOfColors[buttonxColor]))

//        Toast.makeText(this, newColor.toString(), Toast.LENGTH_SHORT).show()
        return buttonxColor
    }
}

