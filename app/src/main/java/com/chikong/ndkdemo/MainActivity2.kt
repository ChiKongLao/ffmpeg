package com.chikong.ndkdemo

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {

companion object{
    init {

        System.loadLibrary("jni-test")
    }
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        fab.setOnClickListener { view ->

//            get()
//            set("haha")


        }


        fab.performClick()



        external fun get(): String
        external fun set(str: String)


    }

}
