package com.gsixacademy.android.alarm

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {

            var i=Intent(applicationContext,MyBroadcastReceiver::class.java)
            var pi=PendingIntent.getBroadcast(applicationContext,111,i,0)
            var am:AlarmManager=getSystemService(Context.ALARM_SERVICE) as AlarmManager
            am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(5*1000),pi)
            Toast.makeText(applicationContext,"Hey!!Soft boiled eggs are now done...bonn appetitt ",Toast.LENGTH_LONG).show()


        }
        button3.setOnClickListener {
            var i=Intent(applicationContext,MyBroadcastReceiver::class.java)
            var pi=PendingIntent.getBroadcast(applicationContext,111,i,0)
            var am:AlarmManager=getSystemService(Context.ALARM_SERVICE) as AlarmManager
            am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(15*1000),pi)
            Toast.makeText(applicationContext,"Hey!!Medium boiled eggs are now done...bonn appetitt ",Toast.LENGTH_LONG).show()





        }
        button4.setOnClickListener {
            var i=Intent(applicationContext,MyBroadcastReceiver::class.java)
            var pi=PendingIntent.getBroadcast(applicationContext,111,i,0)
            var am:AlarmManager=getSystemService(Context.ALARM_SERVICE) as AlarmManager
            am.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+(20*1000),pi)
            Toast.makeText(applicationContext,"Hey!!Hard boiled eggs are now done...bonn appetitt ",Toast.LENGTH_LONG).show()





        }
    }
}
