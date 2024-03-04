package com.example.test.domain.entities

data class GitRepositoriesEntity(
    val id: Int,
    val name: String,
    val private: String,
    val language: String,
    val updatedAt: String
)