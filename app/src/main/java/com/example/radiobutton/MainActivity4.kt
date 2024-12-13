package com.example.radiobutton

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {

    private lateinit var firstRB: RadioButton
    private lateinit var secondRB: RadioButton
    private lateinit var thirdRB: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

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
            var x = intent.getIntExtra("new",0)
            when (radioButton.id) {
                R.id.firstRB -> Toast.makeText(this, "Балда.Учи историю", Toast.LENGTH_SHORT).show()
                R.id.secondRB -> Toast.makeText(this, "Балда.Учи историю", Toast.LENGTH_SHORT).show()
                R.id.thirdRB -> {
                    Toast.makeText(this, "Верно", Toast.LENGTH_SHORT).show()
                    x += 100
                }
            }
            val intent = Intent(this,MainActivity5::class.java)
            intent.putExtra("home",x)
            startActivity(intent)
        }
}