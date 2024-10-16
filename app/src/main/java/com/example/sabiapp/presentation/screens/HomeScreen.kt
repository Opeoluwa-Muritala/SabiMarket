package com.example.sabiapp.presentation.screens

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.currentWindowAdaptiveInfo
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffoldDefaults
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteType
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.window.core.layout.WindowWidthSizeClass
import com.example.sabiapp.module.BottomNavItem
import com.example.sabiapp.navigation.HomeGraph

/**
 * Home : StateFul Composable Displays Bottom Bar
 *      Main Screen Of The App
 * * navItems - List of Bottom Tab Items
 *  * selectedItem - Keeps Track Of Currently Selected Bottom Tab Item
 *  * currentDestination, navBackStackEntry - To Know The Current Screen Displaying
 *  * adaptiveInfo - Size and Orientation Of the screen.
 * @param navController Used To Handle Navigation Between Screens
 * @author Opeoluwa Muritala

 */


@Composable
fun Home(navController: NavHostController) {
    val navItems: List<BottomNavItem> = listOf(
        BottomNavItem.ShelfTab,
        BottomNavItem.InvoiceTab,
        BottomNavItem.ExpenseTab,
        BottomNavItem.JournalTab,
        BottomNavItem.TodoTab,
        BottomNavItem.CalenderTab
    )
    var selectedItem by rememberSaveable {
        mutableIntStateOf(0)
    }
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination
    val adaptiveInfo = currentWindowAdaptiveInfo()

    val NavSuiteType = with(adaptiveInfo) {
            if (windowSizeClass.windowWidthSizeClass == WindowWidthSizeClass.EXPANDED) {
                NavigationSuiteType.NavigationDrawer // Show A Navigation Drawer For Larger Screens
            } else {
                NavigationSuiteScaffoldDefaults.calculateFromAdaptiveInfo(adaptiveInfo)
            }
    } // Handles Bottom Tab Bar Behaviour
    var customNavSuiteType = NavigationSuiteType.None
    when (navItems.any { it.route == currentDestination?.route }) {
        true -> customNavSuiteType = NavSuiteType
        else -> NavigationSuiteType.None
    }
    NavigationSuiteScaffold(
        layoutType = customNavSuiteType,
        navigationSuiteItems = {
            navItems.forEachIndexed { index, item ->
                item(
                    selected = index == selectedItem,
                    onClick = {
                        selectedItem = index
                        navController.navigate(item.route)
                    },
                    icon = {
                        Icon(
                            painterResource(id = item.icon),
                            contentDescription = navItems[index].route,
                        )
                    },
                    label = {
                        Text(item.route, fontSize = 10.sp)
                    },
                )
            }
        }
    ) {
        HomeGraph(navController)
    }
}
