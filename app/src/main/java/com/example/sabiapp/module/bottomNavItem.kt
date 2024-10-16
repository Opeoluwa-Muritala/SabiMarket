package com.example.sabiapp.module

import com.example.sabiapp.R

/**
 * BottomNavItem: Defines Structure For Elements Used In The Bottom Tab Bar
 *
 * @param route Destination or Location of the screen
 * @param icon The Icon displayed to represent item
 * @author Opeoluwa Muritala
 */

sealed class BottomNavItem(val route: String,val icon: Int) {
    data object ShelfTab: BottomNavItem("Shelf", R.drawable.shelf_tab)
    data object InvoiceTab: BottomNavItem("Invoice", R.drawable.invoice_tab)
    data object ExpenseTab: BottomNavItem("Expense", R.drawable.expense_tab)
    data object JournalTab: BottomNavItem("Journal", R.drawable.journal_tab)
    data object TodoTab: BottomNavItem("Todo", R.drawable.todo_tab)
    data object CalenderTab: BottomNavItem("Calender", R.drawable.calender_tab)
}

