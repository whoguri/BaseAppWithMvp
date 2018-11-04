package com.whoguri.learnmvp.javaBase;

// whoGuri 3/11/18

import android.content.Context;
import android.support.v4.app.Fragment;

public class BaseFragment extends Fragment {
    public BaseActivityListener activityListener;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        activityListener= (BaseActivityListener) context;
    }
}
