package com.example.travel.adapter

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.travel.Destinations
import com.example.travel.Hoteleslist
import com.example.travel.databinding.ItemDestinationBinding

class DestinationViewHolder(view: View):RecyclerView.ViewHolder(view){

    val binding = ItemDestinationBinding.bind(view)

    fun render(destinationsModel: Destinations, onClickListener: (Destinations) -> Unit){
        binding.name.text = destinationsModel.destination
        binding.startFinished.text = destinationsModel.starFnished
        binding.off.text = destinationsModel.off
        binding.viewDeal.text = destinationsModel.viewDeal
        Glide.with(binding.imageDestination.context).load(destinationsModel.photo).into(binding.imageDestination)

        // Modificación: Ahora configuramos el clic en el TextView
        binding.viewDeal.setOnClickListener { onTextViewClicked(destinationsModel) }
    }


    // Modificación: Función para manejar el clic en el TextView
    private fun onTextViewClicked(destinations: Destinations) {
        // Abre la actividad HotelsHome al hacer clic en el TextView
        val intent = Intent(itemView.context, Hoteleslist::class.java)
        itemView.context.startActivity(intent)
    }
}