package com.example.test.di

import com.example.test.data.repimpl.GitRepositoryImpl
import com.example.test.domain.repositories.GitRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun bindGitRepository(
        gitRepositoryImpl: GitRepositoryImpl
    ): GitRepository

}