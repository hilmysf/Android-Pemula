package com.dicoding.picodiploma.laligasantander

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvClub: RecyclerView
    private var list: ArrayList<Club> = arrayListOf()
    private var title: String = "La Liga Santander"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvClub = findViewById(R.id.rv_club)
        rvClub.setHasFixedSize(true)

        list.addAll(ClubData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvClub.layoutManager = LinearLayoutManager(this)
        val cardViewClubAdapter = CardViewClubAdapter(list)
        rvClub.adapter = cardViewClubAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.about_me, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.about_me->{
                val moveAbout = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(moveAbout)
            }
        }
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }
}
