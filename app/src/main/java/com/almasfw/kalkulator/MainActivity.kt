package com.almasfw.kalkulator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var answer: Float = 0.0F
    private lateinit var angka: String
    private var boolAdd = false
    private var boolSub = false
    private var boolMul = false
    private var boolDiv = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button0.setOnClickListener() {
            angka = formAngka.text.toString()
            angka += "0"
            formAngka.text = angka
        }

        button1.setOnClickListener() {
            angka = formAngka.text.toString()
            angka += "1"
            formAngka.text = angka
        }

        button2.setOnClickListener() {
            angka = formAngka.text.toString()
            angka += "2"
            formAngka.text = angka
        }

        button3.setOnClickListener() {
            angka = formAngka.text.toString()
            angka += "3"
            formAngka.text = angka
        }

        button4.setOnClickListener() {
            angka = formAngka.text.toString()
            angka += "4"
            formAngka.text = angka
        }

        button5.setOnClickListener() {
            angka = formAngka.text.toString()
            angka += "5"
            formAngka.text = angka
        }

        button6.setOnClickListener() {
            angka = formAngka.text.toString()
            angka += "6"
            formAngka.text = angka
        }

        button7.setOnClickListener() {
            angka = formAngka.text.toString()
            angka += "7"
            formAngka.text = angka
        }

        button8.setOnClickListener() {
            angka = formAngka.text.toString()
            angka += "8"
            formAngka.text = angka
        }

        button9.setOnClickListener() {
            angka = formAngka.text.toString()
            angka += "9"
            formAngka.text = angka
        }

        point.setOnClickListener() {
            angka = formAngka.text.toString()
            angka += "."
            formAngka.text = angka
        }

        add.setOnClickListener() {
            calculate()
            boolAdd = true
            clear()
        }

        sub.setOnClickListener() {
            calculate()
            boolSub = true
            clear()
        }

        mul.setOnClickListener() {
            calculate()
            boolMul = true
            clear()
        }

        div.setOnClickListener() {
            calculate()
            boolDiv = true
            clear()
        }

        equal.setOnClickListener() {
            calculate()
            formAngka.text = answer.toString()
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
}
