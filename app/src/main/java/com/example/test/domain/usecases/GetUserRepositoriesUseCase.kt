package com.example.test.domain.usecases

import com.example.test.domain.entities.GitRepositoriesEntity
import com.example.test.domain.repositories.GitRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class GetUserRepositoriesUseCase @Inject constructor(
    private val gitRepository: GitRepository,
) {

    suspend fun getUserRepositories(): List<GitRepositoriesEntity> =
        gitRepository.getUserRepositories()

}