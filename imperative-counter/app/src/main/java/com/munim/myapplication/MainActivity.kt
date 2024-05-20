package com.munim.myapplication
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCount: TextView = findViewById(R.id.tvCount)
        val btnIncrement: Button = findViewById(R.id.btnIncrement)
        val btnDecrement: Button = findViewById(R.id.btnDecrement)
        val btnReset: Button = findViewById(R.id.btnReset)

        // Set initial count value
        tvCount.text = count.toString()

        // Increment button click listener
        btnIncrement.setOnClickListener {
            count++
            tvCount.text = count.toString()
        }

        // Decrement button click listener
        btnDecrement.setOnClickListener {
            if (count > 0) {
                count--
            }
            tvCount.text = count.toString()
        }

        // Reset button click listener
        btnReset.setOnClickListener {
            count = 0
            tvCount.text = count.toString()
        }

    }
}