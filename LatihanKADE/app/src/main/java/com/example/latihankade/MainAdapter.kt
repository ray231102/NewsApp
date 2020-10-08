package com.example.latihankade

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MainAdapter(val Items: List<Model>) : RecyclerView.Adapter<MainAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list,parent,false))


    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val badge = view.findViewById<ImageView>(R.id.img_badge_league)
        val tvleague = view.findViewById<TextView>(R.id.tv_name_league)
        fun bindItem(items: Model) {
            tvleague.text = items.name
            items.badge?.let { Picasso.get().load(it).fit().into(badge) }
        }

    }

}