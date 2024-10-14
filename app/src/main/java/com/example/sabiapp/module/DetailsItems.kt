package com.example.sabiapp.module

sealed interface DetailsItems {
    data object ShelfStack : DetailsItems
    data object InvoiceStack : DetailsItems
    data object ExpenseStack : DetailsItems
    data object JournalStack : DetailsItems
    data object TodoStack : DetailsItems
    data object CalenderStack : DetailsItems
}