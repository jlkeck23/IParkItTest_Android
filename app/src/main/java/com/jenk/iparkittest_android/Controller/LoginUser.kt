package com.jenk.iparkittest_android.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.jenk.iparkittest_android.R
import kotlinx.android.synthetic.main.activity_login_user.*

class LoginUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        loginSpinner.visibility = View.INVISIBLE
        setContentView(R.layout.activity_login_user)
    }




//    fun enableSpinner(enable: Boolean){
//        if(enable){
//            loginSpinner.visibility = View.VISIBLE
//        }
//        else{
//            loginSpinner.visibility = View.INVISIBLE
//        }
//        userLoginEmailTxt.isEnabled = !enable
//        userLoginPasswordTxt.isEnabled = !enable
//        userLoginForgotBtn.isEnabled =!enable
//        userLoginSignInBtn.isEnabled = !enable
//    }
}
