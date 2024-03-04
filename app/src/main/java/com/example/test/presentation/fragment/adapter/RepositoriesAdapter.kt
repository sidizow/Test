package com.example.test.presentation.fragment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.test.databinding.ItemRepositoriesBinding
import com.example.test.domain.entities.GitRepositoriesEntity

class RepositoriesAdapter() : RecyclerView.Adapter<RepositoriesAdapter.RepositoriesViewHolder>() {

    private var listRepositories = emptyList<GitRepositoriesEntity>()

    //TODO null
    class RepositoriesViewHolder(private val binding: ItemRepositoriesBinding) :
        ViewHolder(binding.root) {
        fun bind(gitRepositoriesEntity: GitRepositoriesEntity) {
            with(binding) {
                nameRep.text = gitRepositoriesEntity.name
                typeRep.text = gitRepositoriesEntity.private
                language.text = gitRepositoriesEntity.language
                updatedAt.text = gitRepositoriesEntity.updatedAt
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoriesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemRepositoriesBinding.inflate(inflater, parent, false)
        return RepositoriesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepositoriesViewHolder, position: Int) {
        val items = listRepositories[position]
        holder.bind(items)
    }

    override fun getItemCount(): Int = listRepositories.size

    fun renderRepositories(listRepositories: List<GitRepositoriesEntity>) {
        val diffResult = DiffUtil.calculateDiff(
            RepositoriesDiffCallback(
                this.listRepositories,
                listRepositories
            )
        )
        this.listRepositories = listRepositories
        diffResult.dispatchUpdatesTo(this)
    }
}