package com.example.sub1kade

import android.graphics.ColorSpace
import android.view.*
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class MainAdapter (val Items: List<ColorSpace.Model>) : RecyclerView.Adapter<MainAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false))

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val logo = view.findViewById<ImageView>(R.id.img_logo_league)
        val nameleague = view.findViewById<TextView>(R.id.tv_name_league)
        fun bindItem(items : Model){
            nameleague.text = items.nama
            items.logo?.let { Picasso.get().load(it).fit().into(logo) }
        }

    }
}