package com.whoguri.learnmvp.ui.home

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.whoguri.learnmvp.R
import com.whoguri.learnmvp.javaBase.BaseActivity
import kotlin.reflect.KDeclarationContainer

class HomeActivity() : BaseActivity(R.id.container) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        replaceFragment(HomeFragment(),true);
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
