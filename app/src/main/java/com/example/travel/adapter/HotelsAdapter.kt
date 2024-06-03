package com.example.travel.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.travel.Hotels
import com.example.travel.R
import com.squareup.picasso.Picasso

class HotelsAdapter(private val hotelist: ArrayList<Hotels>) : RecyclerView.Adapter<HotelsAdapter.HotelsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_hotels,
        parent, false)
        return HotelsViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: HotelsViewHolder, position: Int) {
        val currentItem = hotelist[position]

        holder.hotel.text = currentItem.hotel ?: "Unknown Hotel"
        holder.country.text = currentItem.country ?: "Unknown Country"
        holder.description.text = currentItem.description ?: "No Description"
        holder.stars.text = currentItem.stars ?: "No Rating"
        holder.precio.text = currentItem.precio ?: "No Price"

        Picasso.get()
            .load(currentItem.photo)
            .into(holder.photo)
    }

    override fun getItemCount(): Int {
        return hotelist.size
    }

    class HotelsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val hotel: TextView = itemView.findViewById(R.id.hotel)
        val country: TextView = itemView.findViewById(R.id.country)
        val photo: ImageView = itemView.findViewById(R.id.photo)
        val description: TextView = itemView.findViewById(R.id.description)
        val stars: TextView = itemView.findViewById(R.id.stars)
        val precio: TextView = itemView.findViewById(R.id.precio)
    }
}
