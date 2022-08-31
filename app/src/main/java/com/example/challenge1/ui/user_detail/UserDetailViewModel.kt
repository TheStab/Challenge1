package com.example.challenge1.ui.user_detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.challenge1.common.Resource
import com.example.challenge1.domain.model.UserDetail
import com.example.challenge1.domain.reposoitory.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class UserDetailViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {
    private val _userDetailFlow = MutableStateFlow<Resource<UserDetail>>(Resource.loading(null))
    val userDetailFlow = _userDetailFlow.asStateFlow()

    fun getUserDetail(userId: Int) {
        viewModelScope.launch {
            withContext(IO) {
                val resource = userRepository.getUserDetail(userId)
                _userDetailFlow.value = resource
            }
        }
    }
}