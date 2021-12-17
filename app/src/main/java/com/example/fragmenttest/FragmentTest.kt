package com.example.fragmenttest

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FragmentTest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_test)
        title = "Activity with Fragment"

        //Button 1
        findViewById<Button>(R.id.button1).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container_view, TestFragment1())
                .commit()
        }
        //first fragment
        //Button 2
        findViewById<Button>(R.id.button2).setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view, TestFragment2())
                .commit()
        }
        //show second fragment


    }
}