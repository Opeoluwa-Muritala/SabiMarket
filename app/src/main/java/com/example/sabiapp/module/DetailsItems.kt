package com.example.sabiapp.module

import kotlinx.serialization.Serializable

sealed interface DetailsItems {
    @Serializable
    data object ShelfStack : DetailsItems
    @Serializable
    data object InvoiceStack : DetailsItems
    @Serializable
    data object ExpenseStack : DetailsItems
    @Serializable
    data object JournalStack : DetailsItems
    @Serializable
    data object TodoStack : DetailsItems
    @Serializable
    data object CalenderStack : DetailsItems
}