package com.whoguri.learnmvp.javaBase.findView;

// whoGuri 18/11/18

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.lang.reflect.Field;

public class Finder {
    public static void startFinder(AppCompatActivity activity) {
        //Field fields[] =
        Field[] fields = activity.getClass().getFields();
        for (Field field : fields) {
            FindView findView = field.getAnnotation(FindView.class);
            try {
                field.set(activity, activity.findViewById(findView.viewId()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void startFinder(Fragment fragment, View view) {
        Field fields[] = fragment.getClass().getFields();
        for (Field field : fields) {
            FindView findView = field.getAnnotation(FindView.class);
            try {
                //if (findView != null)
                    field.set(fragment, view.findViewById(findView.viewId()));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
