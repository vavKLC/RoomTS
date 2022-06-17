package com.example.roomts.extensions

import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

fun <T , D : RecyclerView.ViewHolder> ListAdapter<T, D>.submitData(data: T){
    val newList = ArrayList<T>(currentList)
    newList.addAll(listOf(data))
    submitList(
        newList
    )
}