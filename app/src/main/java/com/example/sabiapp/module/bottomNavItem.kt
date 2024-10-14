package com.example.sabiapp.module

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons

sealed class BottomNavItem(route: String, icon: Int) {
    data object ShelfTab: BottomNavItem("Shelf Tab", )
    data object InvoiceTab: BottomNavItem("Invoice Tab", )
    data object ExpenseTab: BottomNavItem("Expense Tab", )
    data object JournalTab: BottomNavItem("Journal Tab", )
    data object TodoTab: BottomNavItem("Todo Tab", )
    data object CalenderTab: BottomNavItem("Calender Tab", )
}