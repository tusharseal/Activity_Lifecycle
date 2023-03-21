package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class SecondActivity : AppCompatActivity() {

    private val TAG = "Second Activity"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        setTitle("Second Activity")

        Log.d(TAG, "onCreate")
        Toast.makeText(this,"I am onCreate from SecondActivity",Toast.LENGTH_SHORT).show()

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
        Toast.makeText(this,"I am onStart from SecondActivity", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
        Toast.makeText(this,"I am onResume from SecondActivity", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
        Toast.makeText(this,"I am onPause from SecondActivity", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
        Toast.makeText(this,"I am onStop from SecondActivity", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
        Toast.makeText(this,"I am onRestart from SecondActivity", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
        Toast.makeText(this,"I am onDestroy from SecondActivity", Toast.LENGTH_SHORT).show()
    }
}