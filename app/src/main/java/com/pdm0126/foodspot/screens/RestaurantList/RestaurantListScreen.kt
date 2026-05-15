package com.pdm0126.foodspot.screens.RestaurantList

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdm0126.foodspot.AppScaffold
import com.pdm0126.foodspot.components.RestaurantItem

@Composable
fun RestaurantListScreen(
  navigateToDetail: (Int) -> Unit,
  viewModel: RestaurantListViewModel = viewModel()
) {
  val restaurants by viewModel.restaurants.collectAsState()
  val loading by viewModel.loading.collectAsState()

  if (loading) {
    AppScaffold(title = "Restaurantes") { padding ->
      Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
      ) {
        CircularProgressIndicator(modifier = Modifier.padding(padding))
      }
    }
    return
  }

  val categories = restaurants.flatMap { it.categories }.distinct()

  AppScaffold(title = "Restaurantes") { padding ->
    LazyColumn(
      modifier = Modifier
        .fillMaxSize()
        .padding(padding)
        .padding(16.dp)
    ) {
      items(categories) { category ->

        val filteredRestaurants = restaurants.filter {
          category in it.categories
        }

        Text(category)
        Spacer(Modifier.height(8.dp))

        LazyRow(
          modifier = Modifier.padding(8.dp)
        ) {
          items(filteredRestaurants) { restaurant ->
            RestaurantItem(
              restaurant,
              { navigateToDetail(restaurant.id) }
            )
            Spacer(Modifier.width(8.dp))
          }
        }
        Spacer(Modifier.height(8.dp))
      }
    }

  }
}