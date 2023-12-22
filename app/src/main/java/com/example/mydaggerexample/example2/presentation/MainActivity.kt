package com.example.mydaggerexample.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mydaggerexample.R
import com.example.mydaggerexample.example2.data.di.ContextModule
import com.example.mydaggerexample.example2.data.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel
    private val component by lazy {
        DaggerApplicationComponent.builder().contextModule(ContextModule(application)).build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}

