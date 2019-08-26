package com.tal.weatherapp

import android.app.Application
import com.tal.weatherapp.di.module.AppComponent
import com.tal.weatherapp.di.AppModule
import com.tal.weatherapp.di.module.ApiModule
import com.tal.weatherapp.di.module.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        setupAppComponent()
    }

    private fun setupAppComponent() {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .apiModule(ApiModule(resources.getString(R.string.base_url)))
            .build()
    }


}