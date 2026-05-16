package com.pdm0126.foodspot.screens.RestaurantDetail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pdm0126.foodspot.AppScaffold
import com.pdm0126.foodspot.components.DishItem
import kotlinx.coroutines.launch

@Composable
fun RestaurantDetailScreen(
  id: Int,
  navigateBack: () -> Unit,
  viewModel: RestaurantDetailViewModel = viewModel()
) {
  val restaurant by viewModel.restaurant.collectAsState()
  val loading by viewModel.loading.collectAsState()

  val snackbarHostState = remember { SnackbarHostState() }
  val scope = rememberCoroutineScope()
  val onAgregar: (dishName: String) -> Unit = {
    scope.launch {
      snackbarHostState.showSnackbar("$it agregado al carrito")
    }
  }

  LaunchedEffect(id) {
    viewModel.loadRestaurantById(id)
  }

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

  AppScaffold(
    title = restaurant?.name ?: "Detalle",
    navigationIcon = {
      IconButton(navigateBack) {
        Icon(
          imageVector = Icons.AutoMirrored.Filled.ArrowBack,
          contentDescription = "Volver",
        )
      }
    },
    snackbarHostState = snackbarHostState
  ) { padding ->
    restaurant?.let {
      Column(
        modifier = Modifier
          .fillMaxSize()
          .padding(padding)
          .padding(16.dp)
      ) {
        Text(it.description)
        Spacer(Modifier.height(16.dp))
        LazyColumn {
          items(it.menu) { dish ->
            DishItem(
              dish,
              { onAgregar(dish.name) }
            )
            Spacer(Modifier.height(8.dp))
          }
        }
      }
    }
  }
}