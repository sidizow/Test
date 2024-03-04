package com.example.test.data.sources.api

import com.example.test.data.sources.entities.GitResponseSourceEntity
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GitRepositoriesApi {

    @GET("/users/{username}/repos")
    suspend fun getRepositories(
        @Path("username") username: String,
        @Query("Accept") accept: String,
    ): List<GitResponseSourceEntity>

}