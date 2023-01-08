package com.tp2.notionsgraphiques2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = ListView(this)

        val names = listOf("Yassine HAMDANE", "Ghita SALAME", "Adnane EL BOUHALI", "Anass LASRY")

        setContentView(listView)

        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,names)

        listView.adapter = arrayAdapter
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, position, id ->
            val selectedItem = adapterView.getItemAtPosition(position) as String
            Toast.makeText(applicationContext,"The name $selectedItem has been clicked.",Toast.LENGTH_SHORT).show()
        }
    }
}


