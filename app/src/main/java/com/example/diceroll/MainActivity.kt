package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val rollButton: Button = findViewById(R.id.button)
            rollButton.setOnClickListener {
                val resultTextView: TextView = findViewById(R.id.textView)
                resultTextView.text = "6"
            }
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
    fun main() {
        val num = 4
        if (num > 4) {
            println("The variable is greater than 4")
        } else if (num == 4) {
            println("The variable is equal to 4")
        } else {
            println("The variable is less than 4")
        }
        The variable is equal to 4
    }
    fun main() {
        val myFirstDice = Dice(6)
        val rollResult = myFirstDice.roll()
        val luckyNumber = 4

        if (rollResult == luckyNumber) {
            println("You win!")
        } else if (rollResult == 1) {
            println("So sorry! You rolled a 1. Try again!")
        } else if (rollResult == 2) {
            println("Sadly, you rolled a 2. Try again!")
        } else if (rollResult == 3) {
            println("Unfortunately, you rolled a 3. Try again!")
        } else if (rollResult == 5) {
            println("Don't cry! You rolled a 5. Try again!")
        } else {
            println("Apologies! You rolled a 6. Try again!")
        }
        fun main() {
            val myFirstDice = Dice(6)
            val rollResult = myFirstDice.roll()
            val luckyNumber = 4

            when (rollResult) {
                luckyNumber -> println("You won!")
                1 -> println("So sorry! You rolled a 1. Try again!")
                2 -> println("Sadly, you rolled a 2. Try again!")
                3 -> println("Unfortunately, you rolled a 3. Try again!")
                5 -> println("Don't cry! You rolled a 5. Try again!")
                6 -> println("Apologies! You rolled a 6. Try again!")
            }
        }

        class Dice(val numSides: Int) {
            fun roll(): Int {
                return (1..numSides).random()
            }
        }
    }
}