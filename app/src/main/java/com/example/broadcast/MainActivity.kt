package com.example.broadcast

import android.app.Activity
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var receiver: TelaReceiver

    public lateinit var myToast: Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.receiver = TelaReceiver()

        val inflater = layoutInflater
        val container: ViewGroup? = findViewById(R.id.custom_toast_container)
        val layout: View? = inflater.inflate(R.layout.custom_toast, container)

        this.myToast = Toast(applicationContext)
        myToast.duration = Toast.LENGTH_LONG
        myToast.setGravity(Gravity.CENTER_VERTICAL, 0, 0)
        myToast.view = layout
        myToast.show()

    }

}

