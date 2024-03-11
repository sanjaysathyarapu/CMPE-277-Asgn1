package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)

        findViewById<Button>(R.id.button_finish_c).setOnClickListener {
//            val data = Intent()
//            data.putExtra("activity", "C")
//            setResult(RESULT_OK, data)
            finish()
        }
    }
}
