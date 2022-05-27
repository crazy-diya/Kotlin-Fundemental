package com.ktl1.basic1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        button.setOnClickListener {

            if (textField.text.isEmpty()) {
                Toast.makeText(this@MainActivity, "Empty Field!", Toast.LENGTH_LONG).show()
            } else {
                textField.hint = "fuck"
                val data = textField.text.toString()
                message.text = "Welcome Brother ! $data"
                textField.text.clear()
            }
        }
    }
}