package com.tal.weatherapp.views.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tal.weatherapp.App
import com.tal.weatherapp.R
import com.tal.weatherapp.views.fragment.SampleFragment

class MainActivity : AppCompatActivity() {
    val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as App).appComponent.inject(this)

        fragmentManager.beginTransaction().add(R.id.container, SampleFragment()).commit()

    }
}
