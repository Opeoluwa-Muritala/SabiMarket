package com.example.sabiapp.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sabiapp.module.Destinations
import com.example.sabiapp.presentation.screens.Home

@Composable
fun HomeGraph (){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destinations.HomeGraph)
    {
        BottomNavGraph()
        DetailsGraph()
    }
}




