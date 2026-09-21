package mx.edu.utez.conversor.listas4e.ui.components

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import mx.edu.utez.conversor.listas4e.ui.model.Place

@Composable
fun PlaceList(places: List<Place>) {
    LazyColumn() {
        items(
            items = places,
            key = { place -> place.id }){
            PlaceCard(it)

        }
    }
}