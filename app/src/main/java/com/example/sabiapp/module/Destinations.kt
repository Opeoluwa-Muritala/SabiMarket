package com.example.sabiapp.module

import kotlinx.serialization.Serializable

/**
 * Destinations: Host The Main Screens Destination In The App For Navigating
 *          To Main Graphs
 *
 * @author Opeoluwa Muritala
 */

sealed interface Destinations {
    @Serializable
    data object HomeGraph: Destinations
}

