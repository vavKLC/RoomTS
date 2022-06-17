package com.example.roomts.ui.fragments.users

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.roomts.R
import com.example.roomts.base.BaseFragment
import com.example.roomts.databinding.FragmentUserBinding
import com.example.roomts.extensions.submitData
import com.example.roomts.models.UserUI
import com.example.roomts.ui.adapters.UserAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserFragment(
) : BaseFragment<FragmentUserBinding, UserViewModel>(
    R.layout.fragment_user
) {
    override val binding by viewBinding(FragmentUserBinding::bind)
    override val viewModel: UserViewModel by viewModels()
    private val userAdapter = UserAdapter()

    override fun initialize() {
        binding.btnAdd.setOnClickListener {
            insertData()
        }
        setupAdapter()
    }

    private fun setupAdapter() = with(binding.recyclerView) {
        adapter = userAdapter

    }

    private fun insertData() {
        val userName = binding.etText.text.toString()
        val user = UserUI(0, userName)
        viewModel.insert(user)
        userAdapter.submitData(user)
    }

}