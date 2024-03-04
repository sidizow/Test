package com.example.test.data.repimpl

import com.example.test.data.sources.api.GitRepositoriesApi
import com.example.test.data.sources.base.BaseRetrofitSource
import com.example.test.data.sources.base.Const.ACCEPT
import com.example.test.data.sources.base.Const.UNKNOWN
import com.example.test.data.sources.base.Const.USERNAME
import com.example.test.data.sources.entities.GitResponseSourceEntity
import com.example.test.domain.entities.GitRepositoriesEntity
import com.example.test.domain.repositories.GitRepository
import com.squareup.moshi.Moshi
import javax.inject.Inject
import javax.inject.Singleton
import kotlin.random.Random

@Singleton
class GitRepositoryImpl @Inject constructor(
    private val gitRepositoriesApi: GitRepositoriesApi,
    moshi: Moshi,
) : BaseRetrofitSource(moshi), GitRepository {

    override suspend fun getUserRepositories(): List<GitRepositoriesEntity> =
        wrapRetrofitExceptions {
            gitRepositoriesApi.getRepositories(
                username = USERNAME,
                accept = ACCEPT
            )
                .map { it.toGitRepositoriesEntity() }
                .sortedByDescending { it.updatedAt }
        }


    private fun GitResponseSourceEntity.toGitRepositoriesEntity() = GitRepositoriesEntity(
        id = id ?: -Random.nextInt(),
        name = name ?: UNKNOWN,
        private = when (private) {
            false -> "public"
            true -> "private"
            else -> UNKNOWN
        },
        language = language ?: UNKNOWN,
        updatedAt = updatedAt?.replace(regex = Regex("[a-z,A-Z]"), " ") ?: UNKNOWN
    )
}
