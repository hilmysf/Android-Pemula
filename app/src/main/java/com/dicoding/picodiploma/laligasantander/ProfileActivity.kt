package com.dicoding.picodiploma.laligasantander

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_profile)
        supportActionBar?.title = "Profile"
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val image = R.drawable.a
        val imagePhoto : ImageView = findViewById(R.id.img_profile)

        Glide.with(this)
            .load(image)
            .apply(RequestOptions().override(120,120))
            .into(imagePhoto)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}