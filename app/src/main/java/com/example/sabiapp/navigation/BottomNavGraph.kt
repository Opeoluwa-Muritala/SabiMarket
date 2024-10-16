package com.example.sabiapp.navigation

import androidx.navigation.NavController
import com.example.sabiapp.module.BottomNavItem
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.sabiapp.module.DetailsItems
import com.example.sabiapp.presentation.screens.components.ClickableTextScreen


fun NavGraphBuilder.BottomNavGraph(navController: NavController) {
    composable(route = BottomNavItem.CalenderTab.route,) {
        ClickableTextScreen(
            text = "Calender Tab",
            onTextClick = {navController.navigate(DetailsItems.CalenderStack)}
        )
    }
    composable(route = BottomNavItem.TodoTab.route) {
        ClickableTextScreen(
            text = "Todo Tab",
            onTextClick = {navController.navigate(DetailsItems.TodoStack)}
        )
    }
    composable(route = BottomNavItem.ShelfTab.route) {
        ClickableTextScreen(
            text = "Shelf Tab",
            onTextClick = {navController.navigate(DetailsItems.ShelfStack)}
        )
    }
    composable(route = BottomNavItem.ExpenseTab.route) {
        ClickableTextScreen(
            text = "Expense Tab",
            onTextClick = {navController.navigate(DetailsItems.ExpenseStack)}
        )
    }
    composable(route = BottomNavItem.InvoiceTab.route) {
        ClickableTextScreen(
            text = "Invoice Tab",
            onTextClick = {navController.navigate(DetailsItems.InvoiceStack)}
        )
    }
    composable( route = BottomNavItem.JournalTab.route) {
        ClickableTextScreen(
            text = "Journal Tab",
            onTextClick = {navController.navigate(DetailsItems.JournalStack)}
        )
    }
}