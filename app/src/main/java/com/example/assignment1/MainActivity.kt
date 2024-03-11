package com.example.assignment1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var restartCounter = 0
    private val message = ""
    private lateinit var threadCounterTextView: TextView

//    private val activityBLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
//        if (it.resultCode == RESULT_OK && it.data?.getStringExtra("activity") == "B") {
//            restartCounter += 5
//            updateThreadCounterDisplay()
//        }
//    }
//
//    private val activityCLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
//        if (it.resultCode == RESULT_OK && it.data?.getStringExtra("activity") == "C") {
//            restartCounter += 10
//            updateThreadCounterDisplay()
//        }
//    }

    override fun onRestart() {
        super.onRestart()
        threadCounterTextView.text = "Thread Counter: $restartCounter"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        threadCounterTextView = findViewById(R.id.textViewThreadCounter)

        findViewById<Button>(R.id.button_start_activity_b).setOnClickListener {
            val intentB = Intent(this, ActivityB::class.java)
            restartCounter += 5
            startActivity(intentB)
//            activityBLauncher.launch(intentB)
        }

        findViewById<Button>(R.id.button_start_activity_c).setOnClickListener {
            val intentC = Intent(this, ActivityC::class.java)
            restartCounter += 10
            startActivity(intentC)
//            activityCLauncher.launch(intentC)
        }

        findViewById<Button>(R.id.button_show_dialog).setOnClickListener {
            startActivity(Intent(this, DialogActivity::class.java))
        }

        findViewById<Button>(R.id.button_close_app).setOnClickListener {
            finish()
        }
    }

    private fun updateThreadCounterDisplay() {
        threadCounterTextView.text = "Thread Counter: $restartCounter"
    }
}
