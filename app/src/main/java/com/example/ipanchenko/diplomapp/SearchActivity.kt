package com.example.ipanchenko.diplomapp

import android.os.Bundle
import android.util.Log

class SearchActivity : BaseActivity(1) {
    private val TAG = "SearchActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search)
        setupBottomNavigation()
        Log.d(TAG,"onCreate")
    }
}
