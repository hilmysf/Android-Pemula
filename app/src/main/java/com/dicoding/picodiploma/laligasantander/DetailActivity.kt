package com.dicoding.picodiploma.laligasantander

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_LOGO = "extra_logo"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_GROUND = "extra_ground"
        const val EXTRA_COACH = "extra_coach"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val name = intent.getStringExtra(EXTRA_NAME)
        val logo = intent.getIntExtra(EXTRA_LOGO, 0)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val ground = intent.getStringExtra(EXTRA_GROUND)
        val coach = intent.getStringExtra(EXTRA_COACH)

        val tvNameReceived: TextView = findViewById(R.id.club_name)
        val imgLogo: ImageView = findViewById(R.id.img_club)
        val tvDetail: TextView = findViewById(R.id.about_content)
        val tvGround: TextView = findViewById(R.id.ground_content)
        val tvCoach: TextView = findViewById(R.id.coach_content)

        tvNameReceived.text = name
        tvCoach.text = coach
        tvDetail.text = detail
        tvGround.text = ground
        Glide.with(this)
            .load(logo)
            .apply(RequestOptions().override(350, 550))
            .into(imgLogo)
        supportActionBar?.title = name
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

