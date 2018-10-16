package com.uyumsoft.orsrulman.orsrulman

import android.support.v4.content.ContextCompat.startActivity
import android.content.Intent
import android.os.Bundle
import android.app.Activity


class Splash : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)

        val timerThread = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(5000)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                } finally {
                    val intent = Intent(this@Splash, LoginActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        timerThread.start()
    }

    override fun onPause() {
        // TODO Auto-generated method stub
        super.onPause()
        finish()
    }
}
