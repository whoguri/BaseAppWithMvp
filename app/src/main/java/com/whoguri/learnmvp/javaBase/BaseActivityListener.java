package com.whoguri.learnmvp.javaBase;

// whoGuri 3/11/18

import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;

public interface BaseActivityListener {
    void replaceFragment(Fragment fragment, boolean isAddtoBackStack);
    void goToActivity(Intent intent,boolean isToFinish);
    void showToast(String message);
    void showProgress();
    void hideProgress();

}
