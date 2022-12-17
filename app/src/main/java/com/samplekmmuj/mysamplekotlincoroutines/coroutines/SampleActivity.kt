package com.samplekmmuj.mysamplekotlincoroutines.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.samplekmmuj.mysamplekotlincoroutines.R
import kotlinx.coroutines.*

class SampleActivity : AppCompatActivity() {
    private val TAG = "SampleActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)
        Log.e(TAG, Thread.currentThread().name)
        //Scopes
//        CoroutineScope(Dispatchers.Main).launch {
//            Log.d(TAG, Thread.currentThread().name)
//        }
//
//        CoroutineScope(Dispatchers.IO).launch {
//            Log.d(TAG, Thread.currentThread().name)
//        }
//
//        CoroutineScope(Dispatchers.Default).launch {
//            Log.d(TAG, "${Thread.currentThread().name}")
//        }

        // Introduction of Suspend Functions:
         /**
         * A suspending function is simply a function that can be paused and resumed at a later time. They can execute a long running operation and wait for it to complete without blocking.
         * The syntax of a suspending function is similar to that of a regular function except for the addition of the suspend keyword.
         **/
        GlobalScope.launch{
            val networkCallAnswer = doNetworkCalling()
            Log.d("Main-Activity",networkCallAnswer)
        }

        CoroutineScope(Dispatchers.Default).launch {
            execute()
        }
    }

    suspend fun doNetworkCalling(): String {
        delay(3000L);
        return "Network Result"
    }

    suspend fun execute() {
        delay(5000)
        Log.d(TAG, Thread.currentThread().name)
        Log.d(TAG, "execute: Done.")
    }
}