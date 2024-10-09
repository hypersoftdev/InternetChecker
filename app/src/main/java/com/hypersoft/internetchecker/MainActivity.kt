package com.hypersoft.internetchecker

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.hypersoft.checker.InternetChecker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        testingInternet()
    }

    private fun testingInternet() {
        if (InternetChecker.isInternetAvailable(this)) {
            Toast.makeText(this, "Internet Available", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Internet Not Available", Toast.LENGTH_SHORT).show()
        }
    }
}