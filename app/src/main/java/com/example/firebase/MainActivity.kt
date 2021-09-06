package com.example.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isInvisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        actionBar?.hide()

    }

    override fun onResume() {
        var createAccountTextView:TextView = findViewById(R.id.createUserTextView)
        createAccountTextView.setOnClickListener {
            createUserPage()

        }
        super.onResume()
    }



    private fun createUserPage(){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val createUserFragment = createAccount()
        fragmentTransaction.replace(R.id.constraintLayout,createUserFragment).commit()

    }
}