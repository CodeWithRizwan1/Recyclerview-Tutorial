package com.dev.recyclerviewtutorial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter (var ContryList : ArrayList<Model>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {


    class ViewHolder (itemView: View)  :RecyclerView.ViewHolder(itemView) {
        var image = itemView.findViewById<ImageView>(R.id.countryImage)
        var contryName = itemView.findViewById<TextView>(R.id.countryName)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return ContryList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val List = ContryList[position]
        holder.image.setImageResource(List.countryImage)
        holder.contryName.text = List.countryTitle

    }
}