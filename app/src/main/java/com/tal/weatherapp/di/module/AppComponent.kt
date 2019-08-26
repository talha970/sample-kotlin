package com.tal.weatherapp.di.module

import com.tal.weatherapp.App
import com.tal.weatherapp.di.AppModule
import com.tal.weatherapp.views.activity.MainActivity
import com.tal.weatherapp.views.fragment.SampleFragment
import dagger.Component

@Component(modules = [AppModule::class,ApiModule::class])
interface AppComponent{

    fun inject(app: App)
    fun inject(mainActivity: MainActivity)
    fun inject(sampleFragment: SampleFragment)
}