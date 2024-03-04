package com.example.test.presentation.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.test.domain.entities.GitRepositoriesEntity
import com.example.test.domain.usecases.GetUserRepositoriesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class RepositoriesViewModel @Inject constructor(
    private val getUserRepositoriesUseCase: GetUserRepositoriesUseCase
): ViewModel() {

    //TODO знач <>
    private val _repositories = MutableLiveData<List<GitRepositoriesEntity>>()
    val repositories: LiveData<List<GitRepositoriesEntity>> = _repositories

    init {
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                _repositories.postValue(getUserRepositoriesUseCase.getUserRepositories())
            }
        }
    }


}