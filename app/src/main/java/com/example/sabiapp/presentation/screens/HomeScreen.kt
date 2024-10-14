package com.example.sabiapp.presentation.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuite
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldDefaults
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldLayout
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.window.core.layout.WindowWidthSizeClass
import com.example.sabiapp.module.BottomNavItem
import com.example.sabiapp.module.Destinations
import com.example.sabiapp.navigation.HomeGraph

@Composable
fun Home(navController: NavController) {
    val navSuiteType = NavigationSuiteScaffoldDefaults
        .calculateFromAdaptiveInfo(currentWindowAdaptiveInfo())
    val navItems: List<BottomNavItem> = listOf(
        BottomNavItem.ShelfTab,
        BottomNavItem.InvoiceTab,
        BottomNavItem.ExpenseTab,
        BottomNavItem.JournalTab,
        BottomNavItem.TodoTab,
        BottomNavItem.CalenderTab
    )
    var selectedItem by remember {
        mutableIntStateOf(0)
    }
    val adaptiveInfo = currentWindowAdaptiveInfo() // Custom configuration that shows a navigation drawer in large screens.
    val customNavSuiteType = with(adaptiveInfo) {
        if (windowSizeClass.windowWidthSizeClass == WindowWidthSizeClass.EXPANDED) {
            NavigationSuiteType.NavigationDrawer
        } else {
            NavigationSuiteScaffoldDefaults.calculateFromAdaptiveInfo(adaptiveInfo)
        }
    }

    NavigationSuiteScaffold(
        layoutType = customNavSuiteType,
        navigationSuiteItems = {
            if (navItems.any { it.route == currentDestination?.route }) {
                screens.forEachIndexed { index, item ->
                    item(
                        selected = index == selectedItem,
                        onClick = {
                            select(index)
                            selectedItem = index
                            navController.navigate(item.route)
                        },
                        icon = {
                            Icon(
                                painterResource(id = (if (index == selectedItem) item.filledIcon else item.icon)!!),
                                contentDescription = screens[index].route,
                                tint = if (index == selectedItem) iconColor else MaterialTheme.colorScheme.onSecondary
                            )
                        },
                        label = {
                            Text(item.route)
                        },
                        colors = color,
                    )
                }
            }
        }
    ) {
        content()
    }

    HomeGraph()
    }
}
