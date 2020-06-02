package com.loftydevelopment.dogsjetpackdemo.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.loftydevelopment.dogsjetpackdemo.R
import com.loftydevelopment.dogsjetpackdemo.model.DogBreed
import kotlinx.android.synthetic.main.list_item_dog.view.*

class DogListAdapter (
    val dogsList: ArrayList<DogBreed>
) : RecyclerView.Adapter<DogListAdapter.DogViewHolder>() {

    class DogViewHolder(var view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_item_dog, parent, false)

        return DogViewHolder(view)
    }

    override fun getItemCount() = dogsList.size

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.view.tv_name.text = dogsList[position].breed
        holder.view.tv_lifespan.text = dogsList[position].lifespan
    }

    fun updateDogList(newDogList: List<DogBreed>) {
        dogsList.clear()
        dogsList.addAll(newDogList)

        notifyDataSetChanged()
    }

}