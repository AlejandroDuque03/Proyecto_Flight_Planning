package com.example.travel.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.travel.databinding.ItemDestinationBinding
import com.example.travel.databinding.ItemHotelsBinding
import com.example.travel.hotels

class HotelsViewHolder(view: View):RecyclerView.ViewHolder(view){

    val binding = ItemHotelsBinding.bind(view)


    fun render(hotelsModel: hotels){
        binding.hotel.text = hotelsModel.hotel
        binding.country.text = hotelsModel.country
        binding.description.text = hotelsModel.description
        binding.stars.text = hotelsModel.stars
        binding.precio.text = hotelsModel.precio
        Glide.with(binding.photo.context).load(hotelsModel.photo).into(binding.photo)
    }
}