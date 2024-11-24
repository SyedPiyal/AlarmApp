package com.example.alarmmanagerexampleapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.provider.Settings
import android.os.Handler
import android.os.Looper

class AlarmReceiver:BroadcastReceiver() {

    private var mediaPlayer: MediaPlayer? = null
    override fun onReceive(context: Context?, intent: Intent?) {
        mediaPlayer = MediaPlayer.create(context,Settings.System.DEFAULT_RINGTONE_URI)
        mediaPlayer?.start()
        // Stop the ringtone after 5 seconds (or you can adjust as needed)
        // Stop the ringtone after 5 seconds using Handler with Looper.getMainLooper()
        Handler(Looper.getMainLooper()).postDelayed({
            mediaPlayer?.stop()
            mediaPlayer?.release() // Release resources
        }, 5000)

    }
}