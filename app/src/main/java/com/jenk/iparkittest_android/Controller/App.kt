package com.jenk.iparkittest_android.Controller

import android.app.Application
import com.jenk.iparkittest_android.Utilities.SharedPrefs

/**
 * Created By jennifer on 5/3/18
 */
class App : Application() {

    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {
        prefs = SharedPrefs(applicationContext)
        super.onCreate()
    }
}