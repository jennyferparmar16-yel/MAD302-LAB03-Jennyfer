/**
 * Course: MAD302 - Android Development
 * Lab: Lab 3
 * Name: Jennyfer
 * Student ID: A00201240
 * Date: April 23, 2026
 *
 * Description:
 * This application demonstrates permission handling, asynchronous operations
 * using Kotlin Coroutines, and error handling. It requests camera permission,
 * simulates an API call using delay, and displays results in the UI.
 */
package com.example.lab_3nevin

import android.Manifest
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    // Permission launcher
    private val permissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            fetchData()
        } else {
            textView.text = "Permission Denied"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // KEEP THIS (your existing setup)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // ADD THIS (your lab logic)
        val fetchButton: Button = findViewById(R.id.fetchButton)
        textView = findViewById(R.id.textView)

        fetchButton.setOnClickListener {
            permissionLauncher.launch(Manifest.permission.CAMERA)
        }
    }

    // Coroutine + API simulation
    private fun fetchData() {
        lifecycleScope.launch {
            try {
                textView.text = "Loading..."
                delay(2000)

                // Simulated failure
                if (Math.random() < 0.3) {
                    throw Exception("Simulated network error")
                }

                textView.text = "Data fetched successfully!"
            } catch (e: Exception) {
                textView.text = "Error: ${e.message}"
            }
        }
    }
}