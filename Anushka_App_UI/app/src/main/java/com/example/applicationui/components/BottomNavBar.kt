package com.example.applicationui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Article
import androidx.compose.material.icons.filled.Campaign
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun BottomNavBar() {
    NavigationBar(
        containerColor = Color.Black
    ) {
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.AutoMirrored.Filled.Article, contentDescription = "News", tint = Color.White.copy(alpha = 0.4f)) },
            label = { Text("NEWS", color = Color.White, fontSize = 12.sp) },

        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.Filled.Campaign, contentDescription = "Promos", tint = Color.White.copy(alpha = 0.4f)) },
            label = { Text("PROMOS", color = Color.White, fontSize = 12.sp) }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = { Icon(Icons.Filled.Settings, contentDescription = "Settings", tint = Color.White.copy(alpha = 0.4f)) },
            label = { Text("SETTINGS", color = Color.White, fontSize = 12.sp) }
        )
    }
}