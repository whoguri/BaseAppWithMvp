package com.whoguri.learnmvp.kotlinBase

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity

/* whoGuri 13/11/18 */
class PreferenceManager(val activity: AppCompatActivity) {
    var preferences: SharedPreferences;
    var editor: SharedPreferences.Editor;

    init {
        preferences = activity.getSharedPreferences("pref", android.content.Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    fun setStringValue(key: String, value: String) {
        editor.putString(key, value);
        editor.commit();
    }

    fun getStringValue(key: String) = preferences.getString(key, "")
    fun clearPref() {
        editor.clear().commit();
    }
}
