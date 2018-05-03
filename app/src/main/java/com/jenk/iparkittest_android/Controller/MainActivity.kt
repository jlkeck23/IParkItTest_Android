package com.jenk.iparkittest_android.Controller

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.jenk.iparkittest_android.R
import com.jenk.iparkittest_android.R.id.drawer_layout
import com.jenk.iparkittest_android.Utilities.PLAY_STORE_URL
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        val launchAlertRate = true
         if(launchAlertRate){
             val builder = AlertDialog.Builder(this@MainActivity)

             // Set the alert dialog title
             builder.setTitle("Rate This App")

             // Display a message on alert dialog
             builder.setMessage(getString(R.string.rateIt))

             // Set a positive button and its click listener on alert dialog
             builder.setPositiveButton("RATE NOW"){dialog, which ->
                 val rateIntent = Intent(Intent.ACTION_VIEW, Uri.parse(PLAY_STORE_URL))
                 startActivity(rateIntent)

             }


             // Display a negative button on alert dialog
             builder.setNegativeButton("NO, THANKS"){dialog,which ->

                 println("User clicked no, will set prefs to not display again")

             }


             // Display a neutral button on alert dialog
             builder.setNeutralButton("LATER"){_,_ ->

                 println("user clicked later will set new date to try xx num days")
             }

             // Finally, make the alert dialog using builder
             val dialog: AlertDialog = builder.create()

             // Display the alert dialog on app interface
             dialog.show()

         }

    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_reservation -> {

            }
            R.id.nav_signin -> {
                println("sign in button clicked")
                val loginIntent = Intent(this, LoginUser::class.java)
                startActivity(loginIntent)

            }
            R.id.nav_register -> {

            }
            R.id.nav_receipt -> {
                println("receipt button was clicked")
                val receiptIntent = Intent(this, FindReciepts::class.java)
                startActivity(receiptIntent)
            }
            R.id.nav_rateApp -> {
                val rateIntent = Intent(Intent.ACTION_VIEW, Uri.parse(PLAY_STORE_URL))
                startActivity(rateIntent)
                finish()

            }
            R.id.nav_contactUs -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
