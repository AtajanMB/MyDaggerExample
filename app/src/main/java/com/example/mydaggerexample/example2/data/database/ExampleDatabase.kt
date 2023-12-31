package com.example.mydaggerexample.example2.data.database

import android.content.Context
import android.util.Log
import com.example.mydaggerexample.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context
) {
    fun method() {
        Log.e(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)}")
    }

    companion object {

        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
