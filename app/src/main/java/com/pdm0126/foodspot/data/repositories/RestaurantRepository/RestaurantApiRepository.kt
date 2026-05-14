package com.pdm0126.foodspot.data.repositories.RestaurantRepository

import com.pdm0126.foodspot.dummy.restaurants
import com.pdm0126.foodspot.model.Restaurant
import kotlinx.coroutines.delay

class RestaurantApiRepository: RestaurantRepository {
  override suspend fun getRestaurants(): List<Restaurant> {
    delay(2000)
    return restaurants
  }

  override suspend fun getRestaurantById(id: Int): Restaurant? {
    delay(1000)
    return restaurants.find { it.id == id }
  }
}