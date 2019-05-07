package com.example.bookreview

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.facebook.CallbackManager
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    //firebase auth 관리
    var auth: FirebaseAuth? = null
    //facebook login 처리 관리
    var callbackManager :CallbackManager? = null
    //google login 관리
    var googleSignInClient: GoogleSignInClient? = null
    val GOOGLE_LOGIN_CODE = 9001 //Intent Request ID

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        email_login_button.setOnClickListener { moveMainPage()}

    }
    fun moveMainPage(){
        startActivity(Intent(this,MainActivity::class.java))
        finish()
    }
}