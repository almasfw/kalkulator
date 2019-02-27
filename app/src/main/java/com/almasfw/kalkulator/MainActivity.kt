package com.almasfw.kalkulator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.almasfw.kalkulator.R.id
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var answer = ""
    var angka: String

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

        //add.setOnClickListener(){

        //}
    }

    private fun add(a: Float, b: Float): Float {
        return a + b
    }

    private fun sub(a: Float, b: Float): Float {
        return a - b
    }

    private fun mul(a: Float, b: Float): Float {
        return a * b
    }

    private fun div(a: Float, b: Float): Float {
        return a / b
    }
}
