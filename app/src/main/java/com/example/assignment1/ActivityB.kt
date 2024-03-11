package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        findViewById<Button>(R.id.button_finish_b).setOnClickListener {
//            val data = Intent(this, MainActivity::class.java)
//            data.putExtra("activity", "B")
//            setResult(RESULT_OK, data)
            finish()
        }
    }
}
