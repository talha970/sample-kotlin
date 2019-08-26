package com.tal.weatherapp.views.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.tal.weatherapp.App
import com.tal.weatherapp.R
import com.tal.weatherapp.views.model.SampleFragmentViewModel



class SampleFragment : Fragment() {

    lateinit var viewModel:SampleFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        (activity?.application as App).appComponent.inject(this)
        viewModel = ViewModelProviders.of(this)[SampleFragmentViewModel::class.java]
        return inflater.inflate(R.layout.fragment_sample, container, false)
    }


}
