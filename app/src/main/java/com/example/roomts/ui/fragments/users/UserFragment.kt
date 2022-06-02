package com.example.roomts.ui.fragments.users

import android.os.Bundle
import android.provider.SyncStateContract.Helpers.insert
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.roomts.R
import com.example.roomts.base.BaseFragment
import com.example.roomts.databinding.FragmentUserBinding
import com.example.roomts.models.UserUI

class UserFragment(
    private val userUI: UserUI
) : BaseFragment<FragmentUserBinding,UserViewModel>(
    R.layout.fragment_user
) {
    override val binding by viewBinding(FragmentUserBinding::bind)
    override val viewModel: UserViewModel by viewModels()

    override fun launchObservers() {
        viewModel.getUser()
    }
}