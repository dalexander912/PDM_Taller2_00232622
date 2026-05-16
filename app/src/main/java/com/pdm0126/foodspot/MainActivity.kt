package com.pdm0126.foodspot

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import com.pdm0126.foodspot.screens.RestaurantDetail.RestaurantDetailScreen
import com.pdm0126.foodspot.screens.RestaurantList.RestaurantListScreen
import com.pdm0126.foodspot.screens.RestaurantSearch.RestaurantSearchScreen
import com.pdm0126.foodspot.ui.theme.FoodSpotTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      FoodSpotTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
          FoodSpot(
            modifier = Modifier.padding(innerPadding)
          )
        }
      }
    }
  }
}

@Composable
fun FoodSpot(modifier: Modifier = Modifier) {
  val backStack = rememberNavBackStack(Routes.RestaurantList)

  NavDisplay(
    backStack = backStack,
    onBack = { backStack.removeLastOrNull() },
    entryProvider = entryProvider {
      entry<Routes.RestaurantList> {
        RestaurantListScreen(
          { id -> backStack.add(Routes.RestaurantDetail(id)) },
          { backStack.add(Routes.RestaurantSearch) }
        )
      }
      entry<Routes.RestaurantDetail> { key ->
        RestaurantDetailScreen(
          key.id,
          { backStack.removeLastOrNull() }
        )
      }
      entry<Routes.RestaurantSearch> {
        RestaurantSearchScreen(
          { backStack.removeLastOrNull() },
          { id -> backStack.add(Routes.RestaurantDetail(id)) }
        )
      }
    }
  )
}