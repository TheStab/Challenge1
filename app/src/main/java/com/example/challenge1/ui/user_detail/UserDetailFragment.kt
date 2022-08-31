package com.example.challenge1.ui.user_detail

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import com.example.challenge1.common.Resource
import com.example.challenge1.databinding.FragmentUserDetailBinding
import com.example.challenge1.extensions.setImage
import com.example.challenge1.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class UserDetailFragment :
    BaseFragment<FragmentUserDetailBinding>(FragmentUserDetailBinding::inflate) {

//    private val viewModel: UserDetailViewModel by viewModels()
//    private val args: UserDetailFragmentArgs by navArgs()


    override fun start() {
        observes()
//        viewModel.getUserDetail(args.userId)
        setListeners()
    }

    private fun setListeners() {
        binding.swipeRefresh.setOnRefreshListener {
//            viewModel.getUserDetail(args.userId)
        }
    }

    private fun observes() {
//        viewLifecycleOwner.lifecycleScope.launch {
//            viewModel.userDetailFlow.collect {
//                when (it.status) {
//                    Resource.Status.SUCCESS -> {
//                        binding.swipeRefresh.isRefreshing = false
//                        binding.tvName.text = it.data?.data?.firstName.plus(" ").plus(it.data?.data?.lastName)
//                        binding.profileImage.setImage(it.data?.data?.avatar)
//                    }
//                    Resource.Status.ERROR -> {
//                        binding.swipeRefresh.isRefreshing = false
//                    }
//                    Resource.Status.LOADING -> {
//                        binding.swipeRefresh.isRefreshing = true
//                    }
//                }
//            }
//        }
    }


}