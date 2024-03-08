package com.example.fragmentapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment1, Fragment1(), Fragment1.TAG)
                .add(R.id.fragment2, Fragment2(), Fragment2.TAG)
                .add(R.id.fragment3, Fragment3(), Fragment3.TAG)
                .commit()
        }

    }




}

