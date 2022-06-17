package com.example.roomts.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.roomts.databinding.UserItemBinding
import com.example.roomts.models.UserUI

class UserAdapter : ListAdapter<UserUI, UserAdapter.UserViewHolder>(
    CharacterComparator
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder =
        UserViewHolder(
            UserItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        getItem(position)?.let {
            holder.onBind(it)
        }
    }

    class UserViewHolder(private val binding: UserItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(user: UserUI) {
            binding.userTv.text = user.userName
        }

    }
}

object CharacterComparator : DiffUtil.ItemCallback<UserUI>() {
    override fun areItemsTheSame(
        oldItem: UserUI,
        newItem: UserUI
    ): Boolean =
        oldItem.id == newItem.id

    override fun areContentsTheSame(
        oldItem: UserUI,
        newItem: UserUI
    ): Boolean =
        oldItem == newItem

}