package com.shawnmichael.PeopleCounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BtnDontClick = findViewById<Button>(R.id.tryMe)
        val TxtView = findViewById<TextView>(R.id.textView)
        var TimesClicked = 0
        BtnDontClick.setOnClickListener {
            TimesClicked += 1

            TxtView.text = TimesClicked.toString()
            Toast.makeText(this, "New person counted!", Toast.LENGTH_SHORT).show()
        }
    }
}