package com.example.toolbarlssn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Edited Title"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home) finish()
        return true
    }
}