package com.ray.newsapp.ui.detailnews

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ray.newsapp.R
import com.squareup.picasso.Picasso


class DetailBeritaActivity : AppCompatActivity() {

    var judul: String? = ""
    var penulis: String? = ""
    var penjelas: String? = ""
    var tanngal: String? = ""
    var gambar: String? = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setTitle("Detail News")

        val title = findViewById<TextView>(R.id.title2)
        val author = findViewById<TextView>(R.id.authorNews)
        val desc = findViewById<TextView>(R.id.descNews1)
        val date = findViewById<TextView>(R.id.dateNews)
        val imageDetail =findViewById<ImageView>(R.id.imageDetail)

        judul = intent.getStringExtra("title")
        title.setText(judul)

        penjelas = intent.getStringExtra("deskripsi")
        desc.setText(penjelas)

        penulis = intent.getStringExtra("author")
        author.setText(penulis)

        tanngal = intent.getStringExtra("date")
        date.setText(tanngal)

        gambar = intent.getStringExtra("image")
        if (gambar != null) {
            Picasso.get().load(gambar).into(imageDetail)
        }
    }
}