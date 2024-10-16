package com.example.sabiapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.sabiapp.module.BottomNavItem
import com.example.sabiapp.module.Destinations
import com.example.sabiapp.presentation.screens.Home

/**
 * HomeGraph - Main Navigation Graph Holds All The Navigation Screens
 * BottomNavGraph - Contains All Navigation Concerning Bottom Tab Bar
 * DetailsGraph - Contains All Navigation Concerning Tab Stack
 * @author Opeoluwa Muritala
 */
@Composable
fun HomeGraph (navHostController: NavHostController){

    NavHost(navController = navHostController, startDestination = BottomNavItem.ShelfTab.route)
    {
        BottomNavGraph(navHostController)
        DetailsGraph(navHostController)
    }
}




