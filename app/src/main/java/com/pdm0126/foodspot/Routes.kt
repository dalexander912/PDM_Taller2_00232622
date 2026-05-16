package com.pdm0126.foodspot

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed class Routes : NavKey {
  @Serializable
  data object RestaurantList : Routes()

  @Serializable
  data class RestaurantDetail(val id: Int) : Routes()

  @Serializable
  data object RestaurantSearch : Routes()
}