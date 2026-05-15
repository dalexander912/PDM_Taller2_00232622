package com.pdm0126.foodspot.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.pdm0126.foodspot.model.Restaurant

@Composable
fun RestaurantItem(
  restaurant: Restaurant,
  onClick: () -> Unit
) {
  Card(
    modifier = Modifier
      .size(width = 200.dp, height = 250.dp)
      .clickable { onClick() },
    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
    shape = RoundedCornerShape(12.dp)
  ) {
    Column(
      modifier = Modifier
        .fillMaxSize()
        .padding(8.dp),
      horizontalAlignment = Alignment.CenterHorizontally
    ) {
      AsyncImage(
        model = restaurant.imageUrl,
        contentDescription = restaurant.name,
        modifier = Modifier.size(150.dp),
        contentScale = ContentScale.Crop
      )
      Text(
        text = restaurant.name,
        fontWeight = FontWeight.Bold
      )
      Text(
        text = "Ver menú",
        fontWeight = FontWeight.ExtraLight
      )
    }
  }
}