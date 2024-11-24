package com.example.alarmmanagerexampleapp

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var edText: EditText
    private lateinit var btnStartNow: Button
    private lateinit var alarmManager: AlarmManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        edText = findViewById(R.id.editText)
        btnStartNow = findViewById(R.id.btnStart)
        alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        btnStartNow.setOnClickListener {
            val timeInMinutes = edText.text.toString().toIntOrNull()
            if (timeInMinutes != null) {
                setAlarm(timeInMinutes)
            }

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun setAlarm(timeInMinutes: Int) {
        val calendar = Calendar.getInstance()
        calendar.add(Calendar.SECOND, timeInMinutes)

        val intent = Intent(this, AlarmReceiver::class.java)

        val pendingIntent =
            PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        // Set the alarm
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)
    }
}