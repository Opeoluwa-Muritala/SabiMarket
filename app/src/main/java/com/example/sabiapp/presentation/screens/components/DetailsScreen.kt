package com.example.sabiapp.presentation.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

/**
 * DetailsScreen: StatelessComposable A screen containing a large text at the center
 *              And an arrow to go back to the previous screen at the topRight
 * @param text Text to be displayed on the screen.
 * @param onClick Action to take when text or icon is clicked
 *@author Opeoluwa Muritala
 */
@Composable
fun DetailsScreen(
    text: String,
    onClick: () -> Unit
){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            IconButton(onClick = onClick) {
                Icon(imageVector = Icons.AutoMirrored.Default.ArrowBack, contentDescription = "Back")
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        ClickableTextScreen(
            text = text,
            onTextClick = onClick
        )
        Spacer(modifier = Modifier.weight(1f))
    }
}