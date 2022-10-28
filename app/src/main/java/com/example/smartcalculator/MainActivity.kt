package com.example.smartcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartcalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//      키패드

        binding.btn0.setOnClickListener {
            binding.textView.append("0")
        }
        binding.btn1.setOnClickListener {
            binding.textView.append("1")
        }
        binding.btn2.setOnClickListener {
            binding.textView.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.textView.append("3")
        }
        binding.btn4.setOnClickListener {
            binding.textView.append("4")
        }
        binding.btn5.setOnClickListener {
            binding.textView.append("5")
        }
        binding.btn6.setOnClickListener {
            binding.textView.append("6")
        }
        binding.btn7.setOnClickListener {
            binding.textView.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.textView.append("8")
        }
        binding.btn9.setOnClickListener {
            binding.textView.append("9")
        }

//      보조키

        binding.btnX.setOnClickListener {

        }
        binding.btnChange.setOnClickListener {

        }
        binding.btnM.setOnClickListener {

        }
        binding.btnFahrenheit.setOnClickListener {

        }
        binding.btnAcreage.setOnClickListener {

        }
        binding.btnInch.setOnClickListener {

        }

//      연산자

        binding.btnPlus.setOnClickListener {

        }
        binding.btnMinus.setOnClickListener {

        }
        binding.btnObelus.setOnClickListener {

        }
        binding.btnTimes.setOnClickListener {

        }
        binding.btnEqual.setOnClickListener {

        }

    }
}