package com.example.thecampsitecommander

import android.os.Bundle
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

class Results : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TheCampsiteCommanderTheme {
                val totalitems = intent.getIntExtra("totalitems", 0)
                val item = intent.getStringExtra("item")
                val category = intent.getStringExtra("category")
                val quantity = intent.getStringExtra("quality")
                val comment = intent.getStringExtra("comment")
                Button(
                    onClick = {

                    }
                ) {
                    finishAffinity()
                    Text("Exit")
                }
            }
        }
    }
}

