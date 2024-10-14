package com.example.sabiapp.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navDeepLink
import androidx.navigation.navigation
import com.example.sabiapp.module.Destinations
import com.example.sabiapp.module.DetailsItems
import com.example.sabiapp.presentation.screens.components.ClickableTextScreen

fun NavGraphBuilder.DetailsGraph() {
    composable<DetailsItems.CalenderStack>(content = {
        ClickableTextScreen(
            text = "Calender Stack",
            onTextClick = {}
        )
    })
    composable<DetailsItems.TodoStack> {
        ClickableTextScreen(
            text = "Todo Stack",
            onTextClick = {}
        )
    }
    composable<DetailsItems.ShelfStack> {
        ClickableTextScreen(
            text = "Shelf Stack",
            onTextClick = {}
        )
    }
    composable<DetailsItems.ExpenseStack> {
        ClickableTextScreen(
            text = "Expense Stack",
            onTextClick = {}
        )
    }
    composable<DetailsItems.InvoiceStack> {
        ClickableTextScreen(
            text = "Invoice Stack",
            onTextClick = {}
        )
    }
    composable<DetailsItems.JournalStack> {
        ClickableTextScreen(
            text = "Journal Stack",
            onTextClick = {}
        )
    }
}