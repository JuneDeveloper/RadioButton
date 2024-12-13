package com.example.radiobutton

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity6 : AppCompatActivity() {

    private lateinit var firstRB: RadioButton
    private lateinit var secondRB: RadioButton
    private lateinit var thirdRB: RadioButton


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        firstRB = findViewById(R.id.firstRB)
        secondRB = findViewById(R.id.secondRB)
        thirdRB = findViewById(R.id.thirdRB)

        firstRB.setOnClickListener(radioButtonClickListener)
        secondRB.setOnClickListener(radioButtonClickListener)
        thirdRB.setOnClickListener(radioButtonClickListener)

    }
    private val radioButtonClickListener =
        View.OnClickListener { view ->
            val radioButton = view as RadioButton
            var x = intent.getIntExtra("you",0)
            when (radioButton.id) {
                R.id.firstRB -> Toast.makeText(this, "Балда.Учи историю", Toast.LENGTH_SHORT).show()
                R.id.secondRB -> Toast.makeText(this, "Балда.Учи историю", Toast.LENGTH_SHORT).show()
                R.id.thirdRB -> {
                    Toast.makeText(this, "Верно", Toast.LENGTH_SHORT).show()
                    x += 100
                }
            }
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("final",x)
            startActivity(intent)
        }
}