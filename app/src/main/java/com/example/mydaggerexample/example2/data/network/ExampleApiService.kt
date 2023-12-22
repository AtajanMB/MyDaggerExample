package com.example.mydaggerexample.example2.data.network

import android.content.Context
import android.util.Log
import com.example.mydaggerexample.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context
) {

    fun method() {
        Log.e(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)}")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
