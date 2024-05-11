package com.example.travel.adapter

import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.Destinations
import com.example.travel.R

class DestinationAdapter(private val destinationsList:List<Destinations>, private val onClickListener: (Destinations) -> Unit): RecyclerView.Adapter<DestinationViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return DestinationViewHolder(layoutInflater.inflate(R.layout.item_destination, parent, false))
    }

    override fun getItemCount(): Int = destinationsList.size


    override fun onBindViewHolder(holder: DestinationViewHolder, position: Int) {
        val item = destinationsList[position]
        holder.render(item, onClickListener)
    }
}