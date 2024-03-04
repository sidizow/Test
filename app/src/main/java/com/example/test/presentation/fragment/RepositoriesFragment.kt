package com.example.test.presentation.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test.R
import com.example.test.databinding.FragmentRepositoriesBinding
import com.example.test.presentation.base.BaseFragment
import com.example.test.presentation.fragment.adapter.RepositoriesAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RepositoriesFragment : BaseFragment<FragmentRepositoriesBinding>(
    R.layout.fragment_repositories,
    FragmentRepositoriesBinding::inflate
) {

    override val viewModel by viewModels<RepositoriesViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = setupAdapter()
        viewModel.repositories.observe(viewLifecycleOwner) {
            adapter.renderRepositories(it)
        }
    }

    private fun setupAdapter(): RepositoriesAdapter {
        binding.repositoriesRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adapter = RepositoriesAdapter()
        binding.repositoriesRecyclerView.adapter = adapter
        return adapter
    }

}