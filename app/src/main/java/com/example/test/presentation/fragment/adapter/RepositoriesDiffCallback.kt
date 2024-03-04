package com.example.test.presentation.fragment.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.test.domain.entities.GitRepositoriesEntity

class RepositoriesDiffCallback(
    private val oldList: List<GitRepositoriesEntity>,
    private val newList: List<GitRepositoriesEntity>,
): DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition].id == newList[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

}