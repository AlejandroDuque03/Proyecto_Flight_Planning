package com.example.travel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.adapter.DestinationAdapter
import com.example.travel.databinding.ActivityHomeBinding

class Home() : AppCompatActivity() {

    private lateinit var  binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){

        binding.destination.layoutManager = LinearLayoutManager(this)
        binding.destination.adapter = DestinationAdapter (DestinationsProvider.destinationsList)

    }

}