package com.example.latihankade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var items: MutableList<Model> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniData()
        val rv_main = findViewById<RecyclerView>(R.id.rv_club_main)
        rv_main.layoutManager = GridLayoutManager (this,3)
        rv_main.adapter = MainAdapter(items)
    }

    fun iniData(){
        val name = resources.getStringArray(R.array.data_league_name)
        val image = resources.obtainTypedArray(R.array.data_league_badge)
        items.clear()

        for (i in name.indices){
            items.add(Model(image.getResourceId(i,0), name[1]))
        }

        image.recycle()

    }
}
