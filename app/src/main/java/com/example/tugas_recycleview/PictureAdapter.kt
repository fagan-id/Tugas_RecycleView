package com.example.tugas_recycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas_recycleview.databinding.ItemPictureBinding

typealias OnClickPicture = (Picture)-> Unit
class PictureAdapter(
    private val listPicture: List<Picture>,
    private val OnClickPicture : OnClickPicture)
    : RecyclerView.Adapter<PictureAdapter.ItemPictureViewHolder>() {
        inner class ItemPictureViewHolder(private val binding : ItemPictureBinding):
                RecyclerView.ViewHolder(binding.root){
                    fun bind(data: Picture){
                        with(binding){

                            imgType.setImageResource(data.getDrawable())

                            itemView.setOnClickListener{
                                OnClickPicture(data)
                            }
                        }
                    }
                }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemPictureViewHolder {
        val binding = ItemPictureBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ItemPictureViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listPicture.size
    }

    override fun onBindViewHolder(holder: ItemPictureViewHolder, position: Int) {
        holder.bind(listPicture[position])
    }

}