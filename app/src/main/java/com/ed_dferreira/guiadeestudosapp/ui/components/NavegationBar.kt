package com.ed_dferreira.guiadeestudosapp.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.BarChart
import androidx.compose.material.icons.outlined.ChatBubbleOutline
import androidx.compose.material.icons.outlined.EventAvailable
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AppNavigationBar(modifier: Modifier = Modifier) {
    val navItems = listOf(
        "Início" to Icons.Outlined.Home,
        "Progresso" to Icons.Outlined.BarChart,
        "Plano" to Icons.Outlined.EventAvailable,
        "Tutor IA" to Icons.Outlined.ChatBubbleOutline
    )

    var selectedItemIndex by remember { mutableIntStateOf(0) }

    NavigationBar(modifier = modifier) {
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedItemIndex == index,
                onClick = {
                    selectedItemIndex = index
                },
                icon = {
                    Icon(
                        imageVector = item.second,
                        contentDescription = item.first
                    )
                },
                label = {
                    Text(text = item.first)
                }
            )
        }
    }
}

@Preview
@Composable
private fun AppNavigationBarPreview() {
    AppNavigationBar()
}