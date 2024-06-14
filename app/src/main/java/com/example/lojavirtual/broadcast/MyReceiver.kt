package com.example.lojavirtual.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val action = intent.action
        when(action){
            Intent.ACTION_POWER_CONNECTED -> "Celular Carregando"
            Intent.ACTION_AIRPLANE_MODE_CHANGED -> "Modo Avião Ativado"
        }
    }
}