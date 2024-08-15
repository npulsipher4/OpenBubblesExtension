package com.example.openbubblesextension

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.Base64
import com.bluebubbles.messaging.MadridMessage
import java.io.ByteArrayOutputStream
import java.util.UUID


class KeyboardClickReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.

        val bm = BitmapFactory.decodeResource(context.resources, R.drawable.my_image)
        val baos = ByteArrayOutputStream()
        bm.compress(Bitmap.CompressFormat.JPEG, 70, baos)
        val b = baos.toByteArray()
        val imageEncoded: String = Base64.encodeToString(b, Base64.NO_WRAP)


        val message = MadridMessage().apply {
            messageGuid = UUID.randomUUID().toString()
            ldText = "Basketball"
            url = "data:asdjfladsjf"
            session = UUID.randomUUID().toString()

            imageBase64 = imageEncoded
            caption = "Play basketball"

            isLive = true
        }

        MadridExtension.currentKeyboardHandle?.addMessage(message)
    }
}