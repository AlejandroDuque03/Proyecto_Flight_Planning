package com.example.travel.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.travel.Destinations
import com.example.travel.databinding.ItemDestinationBinding

class DestinationViewHolder(view: View):RecyclerView.ViewHolder(view){

    val binding = ItemDestinationBinding.bind(view)


    fun render(destinationsModel: Destinations){
        binding.name.text = destinationsModel.destination
        binding.startFinished.text = destinationsModel.starFnished
        binding.off.text = destinationsModel.off
        binding.viewDeal.text = destinationsModel.viewDeal
        Glide.with(binding.imageDestination.context).load(destinationsModel.photo).into(binding.imageDestination)
    }
}