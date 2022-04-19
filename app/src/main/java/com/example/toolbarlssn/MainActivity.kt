package com.example.toolbarlssn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Edited Title"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> finish()
            R.id.app_search ->{
                Toast.makeText(this, "Search is cool!", Toast.LENGTH_SHORT).show()
            }
            R.id.app_user_account ->{
                Toast.makeText(this, "User is great", Toast.LENGTH_SHORT).show()
            }
            R.id.info ->{
                Toast.makeText(this, "Info is new oil", Toast.LENGTH_SHORT).show()
            }
            R.id.sttng ->{
                Toast.makeText(this, "Settings are very impotant", Toast.LENGTH_SHORT).show()
            }
        }
        return true
    }
}