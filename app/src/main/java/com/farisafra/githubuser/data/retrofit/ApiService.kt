package com.farisafra.githubuser.data.retrofit

import com.farisafra.githubuser.data.response.DetailUserResponse
import com.farisafra.githubuser.data.response.User
import com.farisafra.githubuser.data.response.UserGithubResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("search/users")
    @Headers("Authorization: token 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")
    fun searchUsers(@Query("q") query: String): Call<UserGithubResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getDetailUser(@Path("username") username: String): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getfollowers(@Path("username") username: String): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(@Path("username") username: String): Call<ArrayList<User>>
}