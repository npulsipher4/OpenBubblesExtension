package com.example.openbubblesextension

import android.app.Service
import android.content.Intent
import android.os.IBinder

class MadridExtensionService : Service() {

    override fun onBind(intent: Intent): IBinder {
        return MadridExtension(this)
    }
}