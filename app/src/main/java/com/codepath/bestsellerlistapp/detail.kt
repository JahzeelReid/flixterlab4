package com.codepath.bestsellerlistapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class detail : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details)
        val name = getIntent().getStringExtra("name")
        val url = getIntent().getStringExtra("url")
        val descrip = getIntent().getStringExtra("descrip")
        val adult = getIntent().getStringExtra("adult")
        val pop = getIntent().getStringExtra("pop")

        // TODO: Find the views for the screen

        // TODO: Get the extra from the Intent

        // TODO: Set the title, byline, and abstract information from the article

        // TODO: Load the media image
    }
}