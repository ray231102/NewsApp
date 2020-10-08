package com.ray.newsapp.ui.homenews

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.ray.newsapp.R
import com.ray.newsapp.adapter.Adapter
import com.ray.newsapp.model.Artikel
import kotlinx.android.synthetic.main.activity_main.*

class MainHome : AppCompatActivity(), ConstructorHome.View {

    lateinit var presenter: PresenterHome


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = PresenterHome(this)
        presenter.getDataNews()
    }

    override fun onFailed(message: String) {
        Toast.makeText(this,"Sedang Masalah",Toast.LENGTH_SHORT).show()
    }


    override fun showDataNews(dataItem: List<Artikel>) {
        newsRecycler.setHasFixedSize(true)
        newsRecycler.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        newsRecycler.adapter = Adapter(this, dataItem)
    }
}