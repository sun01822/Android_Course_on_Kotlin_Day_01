package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var textV1 : TextView
    lateinit var button1 : Button
    var counter: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textV1 = findViewById(R.id.textV1)
        button1 = findViewById(R.id.button1)

        button1.setOnClickListener(){
            counter++;
            if(counter == 0){
               textV1.text = "I love Dhaka"
           }
            else if(counter == 1){
              textV1.text = "I love Chittagong"
           } else if(counter == 2) {
               textV1.text = "I love Khulna"
                counter = -2
           } else{
               textV1.text = "I love Rajshahi"
            }
        }
    }
}