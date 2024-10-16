package com.example.sabiapp.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.sabiapp.module.DetailsItems
import com.example.sabiapp.presentation.screens.components.DetailsScreen

/**
 * DetailsGraph - Extension function of [NavGraphBuilder] containing composable
 *          and navigation instructions for all stack screens
 * @param navController Handles Navigation Between Screens
 * @author Opeoluwa Muritala
 */


fun NavGraphBuilder.DetailsGraph(navController: NavController) {
    composable<DetailsItems.CalenderStack>(content = {
        DetailsScreen(
            text = "Calender Stack",
            onClick = {navController.navigateUp()}
        )
    })
    composable<DetailsItems.TodoStack> {
        DetailsScreen(
            text = "Todo Stack",
            onClick = {navController.navigateUp()}
        )
    }
    composable<DetailsItems.ShelfStack> {
        DetailsScreen(
            text = "Shelf Stack",
            onClick = {navController.navigateUp()}
        )
    }
    composable<DetailsItems.ExpenseStack> {
        DetailsScreen(
            text = "Expense Stack",
            onClick = {navController.navigateUp()}
        )
    }
    composable<DetailsItems.InvoiceStack> {
        DetailsScreen(
            text = "Invoice Stack",
            onClick = {navController.navigateUp()}
        )
    }
    composable<DetailsItems.JournalStack> {
        DetailsScreen(
            text = "Journal Stack",
            onClick = {navController.navigateUp()}
        )
    }
}