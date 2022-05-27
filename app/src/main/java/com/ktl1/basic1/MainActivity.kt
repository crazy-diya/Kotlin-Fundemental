package com.ktl1.basic1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.*
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message = findViewById<TextView>(R.id.textView)
        val textField = findViewById<EditText>(R.id.editTextTextPersonName)
        val button = findViewById<Button>(R.id.button)
        val nextButton = findViewById<Button>(R.id.navButton)
        var data = ""
        nextButton.visibility = INVISIBLE


        button.setOnClickListener {
            if (textField.text.isEmpty()) {
                nextButton.visibility = INVISIBLE
                Toast.makeText(this@MainActivity, "Empty Field!", Toast.LENGTH_LONG).show()
            } else {
                nextButton.visibility = VISIBLE
                textField.hint = "fuck"
                data = textField.text.toString()
                message.text = "Welcome Brother ! $data"
                textField.text.clear()
            }
        }

        nextButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("data",data)
            startActivity(intent)
        }
    }
}