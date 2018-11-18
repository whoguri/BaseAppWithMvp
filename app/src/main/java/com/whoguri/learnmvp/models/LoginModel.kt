package com.whoguri.learnmvp.models

import com.google.gson.JsonElement
import com.whoguri.learnmvp.network.Network
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginModel(private val loginListener: LoginListener) {
    fun verifyLogin(email: String, pass: String) {
/*        Network.callApi().verifyLogin().enqueue(object : Callback<JsonElement> {
            override fun onFailure(call: Call<JsonElement>?, t: Throwable?) {

            }
            override fun onResponse(call: Call<JsonElement>?, response: Response<JsonElement>?) {
                loginListener.onLoginResponse(true)
            }
        })*/
        loginListener.onLoginResponse(email == "email" && pass == "123")
    }

    interface LoginListener {
        fun onLoginResponse(b: Boolean)
    }
}