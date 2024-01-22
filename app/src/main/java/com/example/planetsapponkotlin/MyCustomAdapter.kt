package com.example.planetsapponkotlin

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.zip.Inflater

class MyCustomAdapter(private val context: Context, private val list_item:List<MyData>):
    BaseAdapter()  {

    override fun getCount(): Int {
       return list_item.size
    }

    override fun getItem(position: Int): MyData{
        return list_item[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater


        val view:View
        if(convertView == null){
            view = inflater.inflate(R.layout.list_item, parent,false)
        }else{
            view=convertView
        }
        val title = getItem(position)

        val titleTextView = view.findViewById<TextView>(R.id.planetname)
        val desrcpTextView = view.findViewById<TextView>(R.id.descrp)
        val imageview = view.findViewById<ImageView>(R.id.imageView)

        titleTextView.text = title.title
        desrcpTextView.text = title.descrp
        imageview.setImageResource(title.imageview)

        view.setOnClickListener{
            Toast.makeText(context,"You clicked ${title.title}",Toast.LENGTH_SHORT).show()
    }
        return view
    }
}