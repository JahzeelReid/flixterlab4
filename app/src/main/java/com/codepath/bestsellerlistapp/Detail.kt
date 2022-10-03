package com.codepath.bestsellerlistapp

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class Detail : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details)
        //Toast.makeText(this, "here", Toast.LENGTH_LONG).show()
        val name = getIntent().getStringExtra("name")
        val url = getIntent().getStringExtra("url")
        val descrip = getIntent().getStringExtra("descrip")
        val adult = getIntent().getBooleanExtra("adult", false)
        val pop = getIntent().getStringExtra("pop")

        // TODO: Find the views for the screen
        val namev = findViewById<TextView>(R.id.Movie_title)
        val descripv = findViewById<TextView>(R.id.Movie_descrip)
        val urlv : ImageView = findViewById<View>(R.id.urlimage) as ImageView
        val popv = findViewById<TextView>(R.id.rated)
        val adultv = findViewById<TextView>(R.id.pg)
        namev.setText(name)
        descripv.setText(descrip)
        popv.setText(pop)
        if (adult == false){
            adultv.setText("PG13")
            adultv.setBackgroundColor(Color.GREEN)
        }
        else{
            adultv.setText("ADULT")
            adultv.setBackgroundColor(Color.RED)
        }
        Glide.with(this)
            .load(url)
            .centerInside()
            .into(urlv)




        // TODO: Get the extra from the Intent

        // TODO: Set the title, byline, and abstract information from the article

        // TODO: Load the media image
    }
}