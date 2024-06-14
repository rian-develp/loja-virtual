package com.example.lojavirtual.comuns

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lojavirtual.R
import com.example.lojavirtual.broadcast.MyReceiver

class MainActivity : AppCompatActivity() {

//    private val receiver: MyReceiver = MyReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val intent = IntentFilter()
//        intent.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
//        intent.addAction(Intent.ACTION_POWER_CONNECTED)
//
//        registerReceiver(receiver, intent)
    }

//    override fun onDestroy() {
//        super.onDestroy()
//        unregisterReceiver(receiver)
//    }
}