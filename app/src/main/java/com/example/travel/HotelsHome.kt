package com.example.travel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.adapter.HotelsAdapter
import com.example.travel.databinding.ActivityHotelsBinding

class HotelsHome() : AppCompatActivity() {

    private lateinit var  binding: ActivityHotelsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHotelsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){

        binding.hotels.layoutManager = LinearLayoutManager(this)
        binding.hotels.adapter = HotelsAdapter (HotelsProvider.hotelsList)

    }

}