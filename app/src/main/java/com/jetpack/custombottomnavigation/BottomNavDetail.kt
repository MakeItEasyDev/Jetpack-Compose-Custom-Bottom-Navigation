package com.jetpack.custombottomnavigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun BottomHome() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_outline_home_24),
            contentDescription = "home",
            modifier = Modifier
                .size(250.dp)
                .padding(10.dp)
        )

        Text(
            text = "Home",
            style = MaterialTheme.typography.h5,
            color = Color.Blue,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun BottomSearch() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_outline_search_24),
            contentDescription = "search",
            modifier = Modifier
                .size(250.dp)
                .padding(10.dp)
        )
        Text(
            text = "Search",
            style = MaterialTheme.typography.h5,
            color = Color.Blue,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun BottomFavourite() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_baseline_favorite_border_24),
            contentDescription = "favourite",
            modifier = Modifier
                .size(250.dp)
                .padding(10.dp)
        )
        Text(
            text = "Favourite",
            style = MaterialTheme.typography.h5,
            color = Color.Blue,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
    }
}


@Composable
fun BottomProfile() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_outline_person_outline_24),
            contentDescription = "Profile",
            modifier = Modifier
                .size(250.dp)
                .padding(10.dp)
        )
        Text(
            text = "Profile",
            style = MaterialTheme.typography.h5,
            color = Color.Blue,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )
    }
}








































