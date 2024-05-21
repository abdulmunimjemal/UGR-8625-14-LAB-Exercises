package com.munim.counter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.munim.counter.ui.theme.CounterTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    CounterApp()
                }
            }
        }
    }
}


@Composable
fun CounterApp() {
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "$count", fontSize = 48.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { count++ }, colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)) {
            Text(text = "+")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = { count-- }, colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)) {
            Text(text = "-")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = { count = 0 }, colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)) {
            Text(text = "Reset")
        }
    }
}