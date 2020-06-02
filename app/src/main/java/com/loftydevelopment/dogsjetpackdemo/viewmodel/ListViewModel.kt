package com.loftydevelopment.dogsjetpackdemo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.loftydevelopment.dogsjetpackdemo.model.DogBreed

class ListViewModel : ViewModel() {

    val dogs = MutableLiveData<List<DogBreed>>()
    val dogsLoadError = MutableLiveData<Boolean>()
    val isLoading = MutableLiveData<Boolean>()

    fun refresh() {
        val dog1 = DogBreed(
            "1",
            "Dalmation",
            "15 years",
            "Spotted",
            "Spots",
            "Peaceful",
            ""
        )

        val dog2 = DogBreed(
            "2",
            "Corgi",
            "15 years",
            "Spotted",
            "Spots",
            "Peaceful",
            ""
        )

        val dog3 = DogBreed(
            "3",
            "Golden Retriever",
            "15 years",
            "Spotted",
            "Spots",
            "Peaceful",
            ""
        )

        val dogList = arrayListOf(dog1, dog2, dog3)

        dogs.value = dogList
        dogsLoadError.value = false
        isLoading.value = false
    }
}