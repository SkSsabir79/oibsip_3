package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var valueOne: Float = 0.0f
    private var valueTwo: Float = 0.0f

    private var addition: Boolean = false
    private var subtraction: Boolean = false
    private var multiplication: Boolean = false
    private var division: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            button0.setOnClickListener { editText.append("0") }
            button1.setOnClickListener { editText.append("1") }
            button2.setOnClickListener { editText.append("2") }
            button3.setOnClickListener { editText.append("3") }
            button4.setOnClickListener { editText.append("4") }
            button5.setOnClickListener { editText.append("5") }
            button6.setOnClickListener { editText.append("6") }
            button7.setOnClickListener { editText.append("7") }
            button8.setOnClickListener { editText.append("8") }
            button9.setOnClickListener { editText.append("9") }

            buttonAdd.setOnClickListener {
                if (editText.text.isNotEmpty()) {
                    valueOne = editText.text.toString().toFloat()
                    addition = true
                    editText.text.clear()
                }
            }

            buttonSub.setOnClickListener {
                if (editText.text.isNotEmpty()) {
                    valueOne = editText.text.toString().toFloat()
                    subtraction = true
                    editText.text.clear()
                }
            }

            buttonMul.setOnClickListener {
                if (editText.text.isNotEmpty()) {
                    valueOne = editText.text.toString().toFloat()
                    multiplication = true
                    editText.text.clear()
                }
            }

            buttonDiv.setOnClickListener {
                if (editText.text.isNotEmpty()) {
                    valueOne = editText.text.toString().toFloat()
                    division = true
                    editText.text.clear()
                }
            }

            buttonEqual.setOnClickListener {
                if (editText.text.isNotEmpty()) {
                    valueTwo = editText.text.toString().toFloat()

                    when {
                        addition -> {
                            editText.setText((valueOne + valueTwo).toString())
                            addition = false
                        }
                        subtraction -> {
                            editText.setText((valueOne - valueTwo).toString())
                            subtraction = false
                        }
                        multiplication -> {
                            editText.setText((valueOne * valueTwo).toString())
                            multiplication = false
                        }
                        division -> {
                            editText.setText((valueOne / valueTwo).toString())
                            division = false
                        }
                    }
                }
            }

            buttonClear.setOnClickListener {
                editText.text.clear()
                valueOne = 0.0f
                valueTwo = 0.0f
                addition = false
                subtraction = false
                multiplication = false
                division = false
            }
        }
    }
}
