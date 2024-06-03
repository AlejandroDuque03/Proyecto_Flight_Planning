package com.example.travel

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.travel.R.layout.activity_hotels
import com.example.travel.adapter.HotelsAdapter
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlin.io.path.Path

class Hoteleslist : AppCompatActivity () {

    private lateinit var dbref : DatabaseReference
    private lateinit var HotelRecyclerview : RecyclerView
    private lateinit var HotelArrayList: ArrayList<Hotels>

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_hotels)


        HotelRecyclerview = findViewById(R.id.hotelist)
        HotelRecyclerview.layoutManager = LinearLayoutManager(this)
        HotelRecyclerview.setHasFixedSize(true)

        HotelArrayList = arrayListOf<Hotels>()
        getUserData()

    }

    private fun getUserData() {

        dbref = FirebaseDatabase.getInstance().getReference("Hoteles")

        dbref.addValueEventListener(object : ValueEventListener{

            override fun onDataChange(snapshot: DataSnapshot) {

                if (snapshot.exists()){
                    for (userSnapshot in snapshot.children){

                        val Hoteles = userSnapshot.getValue(Hotels::class.java)
                        HotelArrayList.add(Hoteles!!)
                    }

                    HotelRecyclerview.adapter = HotelsAdapter(HotelArrayList)

                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        })
    }
}