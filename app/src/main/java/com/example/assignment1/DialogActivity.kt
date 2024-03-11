package com.example.assignment1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

        findViewById<Button>(R.id.button_close_dialog).setOnClickListener {
            finish()
        }
    }
}
