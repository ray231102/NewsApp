package com.ray.newsapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ray.newsapp.R
import com.ray.newsapp.model.Artikel
import com.ray.newsapp.ui.detailnews.DetailBeritaActivity
import com.squareup.picasso.Picasso

class Adapter(c: Context?, data: List<Artikel>?) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    var dataItem: List<Artikel>? = data
    var mContext: Context? = c

    override fun getItemCount(): Int {
        return dataItem?.size!!
    }

    override fun onCreateViewHolder(l1: ViewGroup, l2: Int): ViewHolder {
        val inflater = LayoutInflater.from(mContext).inflate(R.layout.item_list, l1, false)
        return ViewHolder(inflater)
    }

    override fun onBindViewHolder(l1: ViewHolder, l2: Int) {

        l1.judul?.text = dataItem?.get(l2)?.title
        l1.content?.text = dataItem?.get(l2)?.content
        Picasso.get().load(dataItem?.get(l2)?.urlToImage).into(l1.image)

        l1.itemView.setOnClickListener {
            val intent = Intent(mContext, DetailBeritaActivity ::class.java)
            intent.putExtra("images",dataItem?.get(l2)?.urlToImage)
            intent.putExtra("title", dataItem?.get(l2)?.title)
            intent.putExtra("deskripsi", dataItem?.get(l2)?.description)
            intent.putExtra("date",dataItem?.get(l2)?.publishedAt)
            intent.putExtra("author",dataItem?.get(l2)?.author)
            mContext!!.startActivity(intent)

        }
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        var judul = itemView?.findViewById<TextView>(R.id.titleNews)
        var content = itemView?.findViewById<TextView>(R.id.contentnews)
        var image = itemView?.findViewById<ImageView>(R.id.imageNews)



    }

}