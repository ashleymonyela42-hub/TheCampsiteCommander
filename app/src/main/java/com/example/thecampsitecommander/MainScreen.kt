package com.example.thecampsitecommander

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.thecampsitecommander.ui.theme.TheCampsiteCommanderTheme

class MainScreen : ComponentActivity() {
    private fun show() {
    }

    private fun showNextCard() {
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TheCampsiteCommanderTheme {
                {
                    Toast.makeText(
                        this,
                        "Campfire",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                showNextCard()
            }
            val intent = Intent(this@MainScreen, MainActivity::class.java)
            startActivity(intent)

        }
    }
}