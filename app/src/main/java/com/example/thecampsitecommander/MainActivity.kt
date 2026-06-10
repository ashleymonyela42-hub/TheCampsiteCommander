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
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.thecampsitecommander.ui.theme.TheCampsiteCommanderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TheCampsiteCommanderTheme {
                Button(
                    onClick = {

                    }
                ) {
                    Text("Add gear")
                    var item by remember { mutableStateOf("") }
                    OutlinedTextField(
                        value = item,
                        onValueChange = { item = it },
                        label = { Text("item") }
                    )
                    var category by remember { mutableStateOf("") }
                    OutlinedTextField(
                        value = category,
                        onValueChange = { category = it },
                        label = { Text("category") }
                    )
                    var quantity by remember { mutableStateOf("") }
                    OutlinedTextField(
                        value = quantity,
                        onValueChange = { quantity = it },
                        label = { Text("quantity") }
                    )
                    var comment by remember { mutableStateOf("") }
                    OutlinedTextField(
                        value = comment,
                        onValueChange = { comment = it },
                        label = { Text("comment") }
                    )

                    val totalitems = 3

                }

            }
        }
    }
}

