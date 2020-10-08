package com.example.sub1kade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var items: MutableList<Model> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        data()
        val rv_main = findViewById<RecyclerView>(R.id.rv_league)
        rv_main.layoutManager = GridLayoutManager(this,3)
        rv_main.adapter = MainAdapter(items)


    }
    fun data(){
        val name = resources.getStringArray(R.array.data_league_name)
        val logo = resources.obtainTypedArray(R.array.data_league_logo)
        items.clear()

        for (i in name.indices){
            items.add(Model(logo.getResourceId(i,0,name[1])))
        }
        logo.recycle()
    }
}
