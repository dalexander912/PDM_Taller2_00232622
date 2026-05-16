package com.pdm0126.foodspot.screens.RestaurantSearch

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.foodspot.data.repositories.RestaurantRepository.RestaurantApiRepository
import com.pdm0126.foodspot.data.repositories.RestaurantRepository.RestaurantRepository
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class RestaurantSearchViewModel : ViewModel() {
  private val restaurantRepository: RestaurantRepository = RestaurantApiRepository()

  private val _restaurants = MutableStateFlow<List<Restaurant>>(emptyList())
  val restaurants = _restaurants.asStateFlow()

  private val _loading = MutableStateFlow(false)
  val loading = _loading.asStateFlow()

  init {
    loadRestaurants()
  }

  fun loadRestaurants() {
    viewModelScope.launch {
      _loading.value = true
      _restaurants.value = restaurantRepository.getRestaurants()
      _loading.value = false
    }
  }
}