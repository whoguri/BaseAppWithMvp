package com.whoguri.learnmvp.javaBase;

// whoGuri 3/11/18

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import com.whoguri.learnmvp.R;
import kotlin.annotation.Target;

public class BaseActivity extends AppCompatActivity implements BaseActivityListener {
    int container;
    Dialog progressDialog;

    public BaseActivity(int container) {
        this.container = container;
    }

    public BaseActivity() {
        container = 0;
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        progressDialog = new Dialog(this);
        progressDialog.setContentView(R.layout.progress_dialog_layout);
        progressDialog.setCancelable(false);
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }

    public void showProgress() {
        if (!progressDialog.isShowing())
            progressDialog.show();
    }

    public void hideProgress() {
        if (progressDialog.isShowing())
            progressDialog.dismiss();
    }

    public void replaceFragment(Fragment fragment,boolean isAddToBackStack){
        if (container!=0) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(container,fragment);
            if (isAddToBackStack)
                transaction.addToBackStack(fragment.getClass().getSimpleName());
            transaction.commit();
        }
    }

    @Override
    public void goToActivity(Intent intent,boolean isToFinish) {
        startActivity(intent);
        if (isToFinish)
            finish();
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
