package com.bangkit.getguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListActivity : AppCompatActivity() {

    private lateinit var rvListWisata: RecyclerView
    private val list = ArrayList<ListWisata>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        rvListWisata = findViewById(R.id.rv_listwisata)
        rvListWisata.setHasFixedSize(true)

        list.addAll(ListWisataData.listData)
        showRecycleView()
    }

    private fun showRecycleView() {
        rvListWisata.layoutManager = LinearLayoutManager(this)
        val listWisataAdapter = ListWisataAdapter(list)
        rvListWisata.adapter = listWisataAdapter
    }


}