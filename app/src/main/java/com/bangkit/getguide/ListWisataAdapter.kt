package com.bangkit.getguide

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListWisataAdapter (private val listWisata: ArrayList<ListWisata>) : RecyclerView.Adapter<ListWisataAdapter.CardViewViewHolder>() {
    inner class CardViewViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        var  imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var  tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var  tvAlamat: TextView = itemView.findViewById(R.id.tv_item_alamat)
        var  tvRating1: TextView = itemView.findViewById(R.id.tv_item_rating1)
        var  imgRating2: ImageView = itemView.findViewById(R.id.iv_item_rating2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_list,parent,false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val wisata = listWisata[position]

        Glide.with(holder.itemView.context)
            .load(wisata.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = wisata.name
        holder.tvAlamat.text = wisata.alamat
        holder.tvRating1.text = wisata.rating1

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context,"Kamu Memilih " + listWisata[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }

    }

    override fun getItemCount(): Int {
        return listWisata.size
    }
}