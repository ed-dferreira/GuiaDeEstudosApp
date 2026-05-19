package com.ed_dferreira.guiadeestudosapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopicColumn() {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(22.dp),
        contentPadding = PaddingValues(
            start = 16.dp,
            end = 16.dp,
            top = 24.dp,
            bottom = 24.dp // Muito útil para a lista não ficar escondida atrás da sua NavigationBar!
        )
    ) {
        item {
            TopicCard("hi", "trevas",8,0.9f)
        }
        item {
            TopicCard("hi3", "paxhsi9zrhguuuuuuuuuuuuuuuuuuuuuuiazfpghopwhjseogfhsóahgpóhsóghósahfgopẃspóghóshroǵhi",3,0.4f)
        }
    }
}

@Preview
@Composable
private fun Preview() {
    TopicColumn()
}