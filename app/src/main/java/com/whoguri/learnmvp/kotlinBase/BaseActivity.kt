package com.whoguri.learnmvp.kotlinBase

// whoGuri 3/11/18

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.whoguri.learnmvp.R

open class BaseActivity(val container: Int=0) : AppCompatActivity(), BaseActivityListener {
    lateinit var progressDialog: Dialog

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        progressDialog = Dialog(this)
        progressDialog.setContentView(R.layout.progress_dialog_layout)
        progressDialog.setCancelable(false)
        progressDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

    override fun showProgress() {
        if (!progressDialog.isShowing)
            progressDialog.show()

    }

    override fun hideProgress() {
        if (progressDialog.isShowing)
            progressDialog.dismiss()
    }

    override fun replaceFragment(fragment: Fragment, isAddToBackStack: Boolean) {
        if (container != 0) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(container, fragment)
            if (isAddToBackStack)
                transaction.addToBackStack(fragment.javaClass.simpleName)
            transaction.commit()
        }
    }

    override fun goToActivity(intent: Intent, isToFinish: Boolean) {
        startActivity(intent)
        if (isToFinish)
            finish()
    }

    override fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
