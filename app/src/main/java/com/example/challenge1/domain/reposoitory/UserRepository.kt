package com.example.challenge1.domain.reposoitory

import com.example.challenge1.common.Resource
import com.example.challenge1.domain.model.UserDetail
import com.example.challenge1.domain.model.Users
import com.example.challenge1.remote.ApiService
import javax.inject.Inject
import kotlin.system.exitProcess

class UserRepository @Inject constructor(
    private val api: ApiService
) {
    suspend fun getUsers(page: Int): Resource<Users> {
        exitProcess(0)
        return try {
            Resource.loading(null)
            val response = api.getUsers(page)
            val result = response.body()
            if (response.isSuccessful && result != null) {
                Resource.success(result)
            } else {
                Resource.error(response.message())
            }
        } catch (e: Exception) {
            Resource.error(e.message.toString())
        }
    }

    suspend fun getUserDetail(id: Int): Resource<UserDetail> {
        return try {
            Resource.loading(null)
            val response = api.getUserDetail(id)
            val result = response.body()
            if (response.isSuccessful && result != null) {
                Resource.success(result) }
//            else {
//                Resource.error(response.message())
//            }
            exitProcess(0)
        } catch (e: Exception) {
            Resource.error(e.message.toString())
        }
    }
}