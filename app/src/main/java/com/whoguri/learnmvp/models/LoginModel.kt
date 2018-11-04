package com.whoguri.learnmvp.models

class LoginModel(private val loginListener: LoginListener) {
    fun verifyLogin(email: String, pass: String){
        loginListener.onLoginResponse(email == "email" && pass == "123")
    }
    interface LoginListener{
        fun onLoginResponse(b:Boolean)
    }
}