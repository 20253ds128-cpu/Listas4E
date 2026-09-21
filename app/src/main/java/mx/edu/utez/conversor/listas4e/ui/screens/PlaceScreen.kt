package mx.edu.utez.conversor.listas4e.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import mx.edu.utez.conversor.listas4e.R
import mx.edu.utez.conversor.listas4e.ui.components.PlaceList
import mx.edu.utez.conversor.listas4e.ui.model.Place

@Composable
fun PlaceScreen() {
    var placeList = listOf(
        Place(
            1,
            R.drawable.guadalajara,
            "Guadalajara",
            "Ciudad hermosa y bellos paisajes."),
        Place(
            2,
            R.drawable.monterrey,
            "Monterrey",
            "Ciudad hermosa y bellos paisajes."),
        Place(
            3,
            R.drawable.cuernavaca,
            "Cuernavaca",
            "Ciudad hermosa y bellos paisajes."),
        Place(
            4,
            R.drawable.bajacalisur,
            "B. California Sur",
            "Ciudad hermosa y bellos paisajes.")
    )

    Column(modifier = Modifier.statusBarsPadding().fillMaxSize(),
        verticalArrangement = Arrangement.Center){
        PlaceList(placeList)
    }

}