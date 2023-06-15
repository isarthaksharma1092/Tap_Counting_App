package com.sarthaksharma.basic

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

        val btnclick = findViewById<Button>(R.id.btn1)
        val edtext = findViewById<EditText>(R.id.edscreen)
        val msgtext = findViewById<TextView>(R.id.msg)
        var onetimeclick = 0

        btnclick.setOnClickListener{
            val message = edtext.text.toString()
            if (message != ""){
                msgtext.text = "Hello $message"
            }
            onetimeclick += 1
            if(onetimeclick == 1) {Toast.makeText(this, "Program executed successfully", Toast.LENGTH_LONG).show()}
            btnclick.text = "HAHA You clicked me $onetimeclick times"
        }
    }
}

// Mission Project Success