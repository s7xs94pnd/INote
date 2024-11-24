package com.example.inote.ui

import android.app.Application
import com.example.inote.ui.utils.AppSittings

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        // тут создается хранилище
        val appSittings = AppSittings()
        appSittings.helper(this)
    }
}