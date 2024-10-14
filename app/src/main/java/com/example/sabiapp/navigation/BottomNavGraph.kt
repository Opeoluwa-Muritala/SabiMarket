package com.example.sabiapp.navigation

import com.example.sabiapp.module.BottomNavItem

package com.example.sabiapp.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navDeepLink
import androidx.navigation.navigation
import com.example.sabiapp.module.Destinations
import com.example.sabiapp.module.DetailsItems
import com.example.sabiapp.presentation.screens.components.ClickableTextScreen

fun NavGraphBuilder.BottomNavGraph() {
    composable<BottomNavItem.CalenderTab>(content = {
        ClickableTextScreen(
            text = "Calender Tab",
            onTextClick = {}
        )
    })
    composable<BottomNavItem.TodoTab> {
        ClickableTextScreen(
            text = "Todo Tab",
            onTextClick = {}
        )
    }
    composable<BottomNavItem.ShelfTab> {
        ClickableTextScreen(
            text = "Shelf Tab",
            onTextClick = {}
        )
    }
    composable<BottomNavItem.ExpenseTab> {
        ClickableTextScreen(
            text = "Expense Tab",
            onTextClick = {}
        )
    }
    composable<BottomNavItem.InvoiceTab> {
        ClickableTextScreen(
            text = "Invoice Tab",
            onTextClick = {}
        )
    }
    composable<BottomNavItem.JournalTab> {
        ClickableTextScreen(
            text = "Journal Tab",
            onTextClick = {}
        )
    }
}