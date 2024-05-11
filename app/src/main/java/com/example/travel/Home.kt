package com.example.travel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.adapter.DestinationAdapter
import com.example.travel.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {

    private lateinit var  binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        binding.destination.layoutManager = LinearLayoutManager(this)
        binding.destination.adapter = DestinationAdapter(DestinationsProvider.destinationsList) { destinations ->
            // Acción al hacer clic en el destino
            onDestinationSelected(destinations)
        }
    }

    private fun onDestinationSelected(destinations: Destinations){
        Toast.makeText(this, destinations.destination, Toast.LENGTH_SHORT).show()
    }

    // Modificación: Ahora abriremos HotelsHome al hacer clic en un TextView
    private fun onTextViewClicked(destinations: Destinations) {
        val intent = Intent(this, HotelsHome::class.java)
        startActivity(intent)
    }
}