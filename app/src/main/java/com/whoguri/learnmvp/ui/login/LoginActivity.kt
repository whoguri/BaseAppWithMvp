package com.whoguri.learnmvp.ui.login

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.whoguri.learnmvp.R
import com.whoguri.learnmvp.models.LoginModel
import com.whoguri.learnmvp.ui.home.HomeActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginView {
    override fun showError() {
        Toast.makeText(this,"invalid credentials",Toast.LENGTH_SHORT).show()
    }

    override fun goToHome() {
        startActivity(Intent(this,HomeActivity::class.java))
        finish()
    }

    private fun login() {
        val email = editText.text.toString()
        val pass = editText2.text.toString()
        if (!email.isNullOrBlank() && !pass.isNullOrEmpty()) {
            presenter.checkCredentials(email,pass)
        }
    }

//    var model = LoginModel()
    var presenter = LoginPresenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button.setOnClickListener {
            login()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.destroy()
    }
}
