package com.example.travel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.Destinations
import com.example.travel.R
import com.example.travel.hotels

class HotelsAdapter(private val hotelList:List<hotels>): RecyclerView.Adapter<HotelsViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelsViewHolder {
        val layoutInflater1 = LayoutInflater.from(parent.context)
        return HotelsViewHolder(layoutInflater1.inflate(R.layout.item_hotels, parent, false))
    }

    override fun getItemCount(): Int = hotelList.size


    override fun onBindViewHolder(holder: HotelsViewHolder, position: Int) {
        val item = hotelList[position]
        holder.render(item)
    }
}