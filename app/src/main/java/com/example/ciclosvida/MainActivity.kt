package com.example.ciclosvida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

   private val TAG = "SESI-SENAI"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onStart")
    }

    //1-FUNÇÃO ONRESUME

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onResume")
    }

    //1-função onPause

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"onPause")
    }


    //1-função onStop

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onStop")
    }

    //1-função onDestroy

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy")
    }
}