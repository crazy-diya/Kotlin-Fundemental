package com.ktl1.basic1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val text = findViewById<TextView>(R.id.textView2)

        Log.i("info","Welcome to fucking message area")
        val intent = intent.getStringExtra("data")
        text.text = intent

    }

    override fun onPause() {
        super.onPause()
        Log.i("override","Second Application OnPause Function")
    }

    override fun onResume() {
        super.onResume()
        Log.i("override","Second Application OnResume Function")
    }

    override fun onStop() {
        super.onStop()
        Log.i("override","Second Application OnStop Function")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("override","Second Application OnRestart Function")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("override","Second Application ONDestroy Function")
    }
}