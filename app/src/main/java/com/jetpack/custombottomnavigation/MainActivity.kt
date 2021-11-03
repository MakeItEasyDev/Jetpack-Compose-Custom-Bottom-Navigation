package com.jetpack.custombottomnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.jetpack.custombottomnavigation.ui.theme.CustomBottomNavigationTheme
import com.jetpack.custombottomnavigation.ui.theme.Purple500

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CustomBottomNavigationTheme {
                Surface(color = MaterialTheme.colors.background) {
                    CustomBottomNav()
                }
            }
        }
    }
}

@Composable
fun CustomBottomNav() {
    val appState = rememberAppState()
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Custom Bottom Navigation",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                },
                backgroundColor = Purple500,
                elevation = AppBarDefaults.TopAppBarElevation
            )
        },
        bottomBar = {
            if (appState.shouldBottomBar) {
                BottomBar(
                    tabs = appState.bottomBatTabs,
                    currentRoute = appState.currentRoute!!,
                    navigateToRoute = appState::navigateToBottomBarRoute
                )
            }
        }
    ) { innerPaddingModifier ->
        NavHost(
            navController = appState.navHostController,
            startDestination = "home",
            modifier = Modifier.padding(innerPaddingModifier)
        ) {
            navigation(
                route = "home",
                startDestination = HomeSection.HOME.route
            ) {
                composable(HomeSection.HOME.route) {
                    BottomHome()
                }
                composable(HomeSection.SEARCH.route) {
                    BottomSearch()
                }
                composable(HomeSection.FAVOURITE.route) {
                    BottomFavourite()
                }
                composable(HomeSection.PROFILE.route) {
                    BottomProfile()
                }
            }
        }
    }
}


























