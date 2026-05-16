package com.pdm0126.foodspot.screens.RestaurantSearch

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdm0126.foodspot.AppScaffold
import com.pdm0126.foodspot.components.RestaurantItem
import com.pdm0126.foodspot.components.SearchItem

@Composable
fun RestaurantSearchScreen(
  navigateBack: () -> Unit,
  navigateToDetail: (Int) -> Unit,
  viewModel: RestaurantSearchViewModel = viewModel()
) {
  val restaurants by viewModel.restaurants.collectAsState()
  val loading by viewModel.loading.collectAsState()

  if (loading) {
    AppScaffold(title = "Cargando") { padding ->
      Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
      ) {
        CircularProgressIndicator(modifier = Modifier
          .padding(padding)
          .size(150.dp)
        )
      }
    }
    return
  }

  var searchValue by rememberSaveable { mutableStateOf("") }

  val filteredRestaurants = restaurants.filter {
    it.name.contains(searchValue, ignoreCase = true) ||
    it.menu.any { dish ->
      dish.name.contains(searchValue, ignoreCase = true)
    }
  }

  AppScaffold(
    title = "Buscar",
    navigationIcon = {
      IconButton(navigateBack) {
        Icon(
          imageVector = Icons.AutoMirrored.Filled.ArrowBack,
          contentDescription = "Volver",
        )
      }
    }
  ) { padding ->
    Column(
      modifier = Modifier
        .fillMaxSize()
        .padding(padding)
        .padding(16.dp)
    ) {
      TextField(
        value = searchValue,
        onValueChange = { searchValue = it },
        modifier = Modifier.fillMaxWidth(),
        label = { Text("Buscar restaurante o platillo") },
        leadingIcon = {
          Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = "Buscar"
          )
        },
        singleLine = true,
      )

      if(filteredRestaurants.isEmpty()) {
        Column(
          modifier = Modifier.fillMaxSize(),
          verticalArrangement = Arrangement.Center,
          horizontalAlignment = Alignment.CenterHorizontally
        ) {
          Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = "Sin resultados",
            modifier = Modifier.size(150.dp)
          )
          Text("No se encontraron resultados")
        }
      } else {
        Spacer(Modifier.height(16.dp))
        Text("${filteredRestaurants.size} resultados encontrados")
        Spacer(Modifier.height(16.dp))
        LazyColumn(
          modifier = Modifier.fillMaxSize(),
          horizontalAlignment = Alignment.CenterHorizontally
        ) {
          items(filteredRestaurants) { restaurant ->
            SearchItem(
              restaurant,
              { navigateToDetail(restaurant.id) }
            )
            Spacer(Modifier.height(8.dp))
          }
        }
      }
    }
  }
}