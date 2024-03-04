package com.example.test.domain.repositories

import com.example.test.domain.entities.GitRepositoriesEntity

interface GitRepository {

    suspend fun getUserRepositories(): List<GitRepositoriesEntity>

}