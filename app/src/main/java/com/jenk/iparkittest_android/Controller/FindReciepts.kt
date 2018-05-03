package com.jenk.iparkittest_android.Controller

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jenk.iparkittest_android.R
import kotlinx.android.synthetic.main.activity_find_reciepts.*

class FindReciepts : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_reciepts)
        receiptSpinner.visibility = View.INVISIBLE
    }

    fun findReceiptBtnClicked(view: View){
        enableSpinner(true)

        val email = ""
        val last4CC = ""

        val mainIntent = Intent(this, MainActivity::class.java)
        startActivity(mainIntent)
        finish()

    }

    fun enableSpinner(enable : Boolean){
        if(enable){
            receiptSpinner.visibility = View.VISIBLE
        }
        else{
            receiptSpinner.visibility = View.INVISIBLE
        }
        receiptEmailTxt.isEnabled = !enable
        receiptCCTxt.isEnabled =!enable
        findReceiptBtn.isEnabled =!enable
    }

}
