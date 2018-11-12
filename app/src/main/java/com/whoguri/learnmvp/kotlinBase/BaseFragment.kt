package com.whoguri.learnmvp.kotlinBase

// whoGuri 3/11/18

import android.content.Context
import android.support.v4.app.Fragment

open class BaseFragment : Fragment() {
    lateinit var activityListener: BaseActivityListener
    override fun onAttach(context: Context?) {
        super.onAttach(context)
        activityListener = (context as BaseActivityListener?)!!
    }
}
