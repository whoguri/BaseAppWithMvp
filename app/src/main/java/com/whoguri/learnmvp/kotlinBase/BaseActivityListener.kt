package com.whoguri.learnmvp.kotlinBase

// whoGuri 3/11/18

import android.content.Intent
import android.support.v4.app.Fragment

interface BaseActivityListener {
    fun replaceFragment(fragment: Fragment, isAddToBackStack: Boolean)
    fun goToActivity(intent: Intent, isToFinish: Boolean)
    fun showToast(message: String)
    fun showProgress()
    fun hideProgress()

}
