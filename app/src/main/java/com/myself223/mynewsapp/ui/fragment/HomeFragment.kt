package com.myself223.mynewsapp.ui.fragment

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.myself223.mynewsapp.R
import com.myself223.mynewsapp.core.BaseFragment
import com.myself223.mynewsapp.databinding.FragmentHomeBinding
import com.saliev1353.newsApp.ui.viewModel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    private var postName = "Bisness"


    private val viewModel: MainViewModel by viewModels()


    override fun getViewBinding(): FragmentHomeBinding = FragmentHomeBinding.inflate(layoutInflater)

    override fun constructListeners() {
        viewModel.getNews("Tesla", "business")
    }

}