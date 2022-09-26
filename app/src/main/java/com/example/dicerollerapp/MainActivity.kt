package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollBtn: Button = findViewById(R.id.button)
        rollBtn.setOnClickListener { rollDice() }

    }

    private fun rollDice() {
        val myDice = Dice(6)
        val rollNum = myDice.roll()
        var textNew :TextView = findViewById(R.id.textView)
        val imageNew :ImageView = findViewById(R.id.imageView)

        when (rollNum){



                1-> imageNew.setImageResource(R.drawable.dice_1)
                2-> imageNew.setImageResource(R.drawable.dice_2)
                3->imageNew.setImageResource(R.drawable.dice_3)

                4->imageNew.setImageResource(R.drawable.dice_4)

                5->imageNew.setImageResource(R.drawable.dice_5)

                else -> imageNew.setImageResource(R.drawable.dice_6)


        }
    }

    class Dice (val sideNum : Int){
        fun roll():Int{
            return (1..sideNum).random()
        }
    }
}