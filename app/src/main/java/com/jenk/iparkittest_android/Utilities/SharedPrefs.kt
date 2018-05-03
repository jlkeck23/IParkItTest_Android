package com.jenk.iparkittest_android.Utilities

import android.content.Context
import android.content.SharedPreferences

/**
 * Created By jennifer on 5/2/18
 */
class SharedPrefs(context : Context) {
    //Set up a local file to store out base user details and their Auth token
    val PREFS_FILENAME = ""
    val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0)

    val IS_LOGGED_IN = "isLoggedIn"
    val AUTH_TOKEN = "authToken"


    //Needed for Rate My App Function
    val PREF_LAUNCH_COUNT = "launch_count"
    val PREF_FIRST_DAY = "date_first"
    val PREF_DONT_SHOW_AGAIN = "dont_show_again"

    //Set up setters & getters
    var isLoggedIn: Boolean
        get() = prefs.getBoolean(IS_LOGGED_IN, false)
        set(value) = prefs.edit().putBoolean(IS_LOGGED_IN, value).apply()

    var authToken: String
        get() = prefs.getString(AUTH_TOKEN, "")
        set(value) = prefs.edit().putString(AUTH_TOKEN, value).apply()

    var launch_count: String
        get() = prefs.getString(PREF_LAUNCH_COUNT, "")
        set(value) = prefs.edit().putString(PREF_LAUNCH_COUNT, value).apply()

    var date_first: String
        get() = prefs.getString(PREF_FIRST_DAY, "")
        set(value) = prefs.edit().putString(PREF_FIRST_DAY, value).apply()

    var dont_show_again: Boolean
        get() = prefs.getBoolean(PREF_DONT_SHOW_AGAIN, false)
        set(value) = prefs.edit().putBoolean(PREF_DONT_SHOW_AGAIN, value).apply()
}

