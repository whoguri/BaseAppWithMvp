package com.whoguri.learnmvp.javaBase;

import android.app.Activity;
import android.content.SharedPreferences;

/* whoGuri 13/11/18 */
public class PreferenceManager {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    public PreferenceManager(Activity activity) {
        preferences = activity.getSharedPreferences("pref", android.content.Context.MODE_PRIVATE);
        editor=preferences.edit();
    }

    void setStringValue(String key, String value ) {
        editor.putString(key,value);
        editor.commit();
    }

    String getStringValue(String key){
        return preferences.getString(key,"");
    }
    void clearPref(){
        editor.clear().commit();
    }
}
