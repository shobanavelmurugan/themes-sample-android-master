package com.cobeisfresh.themes

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class App : Application(){

    override fun onCreate() {
        super.onCreate()
        setDefaultTheme()
    }

    private fun setDefaultTheme() {
        /* To set default theme night ot light */
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.getDefaultNightMode())
    }
}