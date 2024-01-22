package com.example.planetsapponkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myListView: ListView = findViewById<ListView>(R.id.listview)

        val operations = ArrayList<MyData>()

        operations.add(MyData("Mars","24 Moons",R.drawable.mars))
        operations.add(MyData("Moon","0 Moons",R.drawable.moon))
        operations.add(MyData("Venus","11 Moons",R.drawable.venus))


        val customAdapter:MyCustomAdapter = MyCustomAdapter(applicationContext, operations)



        myListView.adapter = customAdapter




    }
}