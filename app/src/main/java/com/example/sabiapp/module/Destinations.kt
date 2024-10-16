package com.example.sabiapp.module

import kotlinx.serialization.Serializable

sealed interface Destinations {
    @Serializable
    data object HomeGraph: Destinations
}

