package com.freak.paint_app

import android.graphics.Color
import android.graphics.Paint
import android.os.Build.VERSION_CODES.P
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.freak.paint_app.paintview.Companion.brushcolor
import com.freak.paint_app.paintview.Companion.colorlist
import com.freak.paint_app.paintview.Companion.pathList
import android.graphics.Path as Path

class MainActivity : AppCompatActivity() {
    //declaring variable
    companion object{
    var path = Path()
    var brush = Paint()
    }
    lateinit var color : ImageButton
    lateinit var eraser : ImageButton
    lateinit var blue : ImageButton
    lateinit var green : ImageButton
    lateinit var brown : ImageButton
    lateinit var yellow : ImageButton
    lateinit var white : ImageButton
    lateinit var pink : ImageButton
    lateinit var cyan : ImageButton
    lateinit var Black :ImageButton


    lateinit var colorArray:ArrayList<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // hiding the default toolbar
        supportActionBar?.hide()
        //mapping
        color = findViewById(R.id.colors)
        eraser = findViewById(R.id.eraser)
        blue = findViewById(R.id.blue)
        green = findViewById(R.id.green)
        brown = findViewById(R.id.brown)
        yellow = findViewById(R.id.yellow)
        white = findViewById(R.id.white)
        Black = findViewById(R.id.violet)
        pink = findViewById(R.id.pink)
        cyan = findViewById(R.id.cyan)
        //declaring functons of the button
        color.setOnClickListener {
            brush.color = Color.RED
            currentColor(brush.color)

        }
        blue.setOnClickListener {
            brush.color = Color.BLUE
            currentColor(brush.color)
        }
        green.setOnClickListener {
            brush.color = Color.GREEN
            currentColor(brush.color)
        }
        brown.setOnClickListener {
            brush.color = Color.LTGRAY
            currentColor(brush.color)
        }
        yellow.setOnClickListener {
            brush.color = Color.YELLOW
            currentColor(brush.color)
        }
        white.setOnClickListener {
            brush.color = Color.WHITE
            currentColor(brush.color)
        }
        Black.setOnClickListener {
            brush.color = Color.BLACK
            currentColor(brush.color)
        }
        pink.setOnClickListener {
            brush.color = Color.MAGENTA
            currentColor(brush.color)
        }
        cyan.setOnClickListener {
            brush.color = Color.CYAN
            currentColor(brush.color)
        }


        eraser.setOnClickListener {
            pathList.clear()
            colorlist.clear()
            path.reset()
        }
    }
        private fun currentColor(color: Int){
            brushcolor = color
            path = Path()
        }



}