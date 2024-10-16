package com.example.sabiapp.presentation.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

/**
 * ClickableTextScreen: StatelessComposable A screen containing a large clickable text at the center
 *                      Main Screen Composable
 * @param text Text to be displayed on the screen.
 * @param onTextClick Action to take when text is clicked
 * @author Opeoluwa Muritala
 */
@Composable
fun ClickableTextScreen(
    text: String,
    onTextClick: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextButton(onClick = onTextClick) {
            Text(
                text = text,
                fontWeight = FontWeight.SemiBold,
                fontSize = 35.sp,
                fontFamily = FontFamily.SansSerif,
            )
        }
        Text(
            text = "Click On Large Texts To Navigate Between Screens" +
                    "From main screen to details screen and vice versa",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}