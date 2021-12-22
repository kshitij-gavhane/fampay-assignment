package com.kshitijgavhane.fampay.utils

import android.content.Context
import android.content.Context.MODE_PRIVATE

class SharedPref(private val context: Context) {

    fun saveDismiss(preferenceName: String, key: String, value: Boolean) {
        getPreferenceEditor(preferenceName).putBoolean(key, value).commit()

    }

    fun isDismissed(
            preferenceName: String,
            key: String
    ): Boolean {
        return getPreference(preferenceName).getBoolean(key, false)
    }

    private fun getPreference(preferenceName: String) =
            context.getSharedPreferences(preferenceName, MODE_PRIVATE)

    private fun getPreferenceEditor(preferenceName: String) = getPreference(preferenceName).edit()
}