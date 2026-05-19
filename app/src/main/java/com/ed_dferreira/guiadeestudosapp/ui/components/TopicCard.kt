package com.ed_dferreira.guiadeestudosapp.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopicCard(title: String, content: String, qtdlessons: Int, progressLessons: Float) {
    val isCompleted = true
    OutlinedCard(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
        ),
        border = BorderStroke(1.dp, Color.Black),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = title,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start
            )
            Text(
                text = content,
                fontSize = 16.sp,
                textAlign = TextAlign.Start
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                CustomBadge(
                    text = "$qtdlessons lições",
                    backgroundColor = Color.Gray,
                    textColor = Color.LightGray
                )
                if (isCompleted) {
                    CustomBadge(
                        text = "Concluído",
                        backgroundColor = Color.Gray,
                        textColor = Color.Green
                    )
                }
            }
            LinearProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth(0.4f)
                    .height(4.dp),
                progress = { progressLessons }

            )
        }
        //onClick(){}
    }
}

@Composable
fun CustomBadge(text: String, backgroundColor: Color, textColor: Color) {
    Box(
        modifier = Modifier
            .background(color = backgroundColor, shape = CircleShape) // CircleShape faz ficar oval/arredondado
            .padding(horizontal = 12.dp, vertical = 4.dp) // Espaçamento interno do texto
    ) {
        Text(
            text = text,
            color = textColor,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Preview
@Composable
private fun Preview() {
    val titulo = "gopjśopjg0p-ujaspgj"
    val contexto = "gpasdjgjokgpjsophjaersdojgh0p[jfhpjpphj"
    val qtdAtiv = 4
    val progress = 0.5f
    TopicCard(titulo, contexto, qtdAtiv, progress)
}