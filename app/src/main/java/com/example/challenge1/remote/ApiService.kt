package com.example.challenge1.remote

import com.example.challenge1.common.ApiEndpoints
import com.example.challenge1.domain.model.UserDetail
import com.example.challenge1.domain.model.Users
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET(ApiEndpoints.USERS)
    suspend fun getUsers(@Query("page") page: Int): Response<Users>

    @GET(ApiEndpoints.USER_DETAIL)
    suspend fun getUserDetail(@Path("idd") id: Int): Response<UserDetail>

}