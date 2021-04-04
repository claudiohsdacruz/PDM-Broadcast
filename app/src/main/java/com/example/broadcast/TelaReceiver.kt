package com.example.broadcast


import android.app.Activity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast


class TelaReceiver : BroadcastReceiver() {
    private lateinit var main: MainActivity

    override fun onReceive(context: Context, intent: Intent) {

    if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
        //Toast.makeText(context, "boot completed", Toast.LENGTH_SHORT).show()

        this.main = MainActivity()
        main.myToast.show()

    }
}

}

