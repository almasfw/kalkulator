package com.almasfw.kalkulator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var answer: Float = 0.0F
    private lateinit var number: String
    private var boolAdd = false
    private var boolSub = false
    private var boolMul = false
    private var boolDiv = false
    private var boolResult = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button0.setOnClickListener() {
            if (formAngka.text != "") {
                buttonAction(button0)
            }
        }

        button1.setOnClickListener() {
            buttonAction(button1)
        }

        button2.setOnClickListener() {
            buttonAction(button2)
        }

        button3.setOnClickListener() {
            buttonAction(button3)
        }

        button4.setOnClickListener() {
            buttonAction(button4)
        }

        button5.setOnClickListener() {
            buttonAction(button5)
        }

        button6.setOnClickListener() {
            buttonAction(button6)
        }

        button7.setOnClickListener() {
            buttonAction(button7)
        }

        button8.setOnClickListener() {
            buttonAction(button8)
        }

        button9.setOnClickListener() {
            buttonAction(button9)
        }

        point.setOnClickListener() {
            if (formAngka.text == "") {
                number = formAngka.text.toString()
                number += R.string.zero_point
                formAngka.text = number
            } else {
                buttonAction(point)
            }
        }

        add.setOnClickListener() {
            if (formAngka.text != "") {
                calculate()
                boolAdd = true
                clear()
            }
        }

        sub.setOnClickListener() {
            if (formAngka.text != "") {
                calculate()
                boolSub = true
                clear()
            }
        }

        mul.setOnClickListener() {
            if (formAngka.text != "") {
                calculate()
                boolMul = true
                clear()
            }
        }

        div.setOnClickListener() {
            if (formAngka.text != "") {
                calculate()
                boolDiv = true
                clear()
            }
        }

        equal.setOnClickListener() {
            if (formAngka.text != "") {
                calculate()
                formAngka.text = answer.toString()
                boolResult = true
            }
        }

        clear.setOnClickListener() {
            answer = 0.0F
            clear()
        }
    }

    private fun calculate() {
        if (boolAdd) {
            answer += formAngka.text.toString().toFloat()
            boolAdd = false
        } else if (boolSub) {
            answer -= formAngka.text.toString().toFloat()
            boolSub = false
        } else if (boolMul) {
            answer *= formAngka.text.toString().toFloat()
            boolMul = false
        } else if (boolDiv) {
            answer /= formAngka.text.toString().toFloat()
            boolDiv = false
        } else {
            answer = formAngka.text.toString().toFloat()
        }
    }

    private fun clear() {
        formAngka.text = ""
    }

    private fun buttonAction(button: Button) {
        if (boolResult) {
            clear()
            boolResult = false
        }
        number = formAngka.text.toString()
        number += button.text.toString()
        formAngka.text = number
    }
}
