package com.pdm0126.foodspot.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.pdm0126.foodspot.model.Restaurant

@Composable
fun SearchItem(
  restaurant: Restaurant,
  onClick: () -> Unit
) {
  Card(
    modifier = Modifier
      .fillMaxWidth()
      .clickable { onClick() },
    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
    shape = RoundedCornerShape(12.dp)
  ) {
    Row(
      modifier = Modifier.padding(8.dp)
    ) {
      AsyncImage(
        model = restaurant.imageUrl,
        contentDescription = restaurant.name,
        modifier = Modifier.size(100.dp),
        contentScale = ContentScale.Crop,
      )
      Spacer(Modifier.width(16.dp))
      Column {
        Text(
          text = restaurant.name,
          fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.width(8.dp))
        Text(
          text = restaurant.description,
          fontWeight = FontWeight.ExtraLight,
          fontSize = 12.sp,
          lineHeight = 16.sp
        )
        Spacer(Modifier.height(16.dp))
        Text(
          text = restaurant.categories.toString(),
          fontWeight = FontWeight.ExtraLight,
          fontSize = 12.sp,
          maxLines = 1
        )
      }
    }
  }
}