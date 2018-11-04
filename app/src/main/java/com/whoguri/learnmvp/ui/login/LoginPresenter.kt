package com.whoguri.learnmvp.ui.login

import com.whoguri.learnmvp.models.LoginModel

class LoginPresenter(private var loginView: LoginView?) : LoginModel.LoginListener {
    override fun onLoginResponse(b: Boolean) {
        if (b)
            loginView?.goToHome()
        else
            loginView?.showError()
    }

    var loginModel = LoginModel(this)

    fun checkCredentials(email: String, pass: String) {
        loginModel.verifyLogin(email, pass)
    }

    fun destroy(){
        loginView=null
    }
}