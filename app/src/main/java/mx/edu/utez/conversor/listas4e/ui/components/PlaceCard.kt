package mx.edu.utez.conversor.listas4e.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import mx.edu.utez.conversor.listas4e.R
import mx.edu.utez.conversor.listas4e.ui.model.Place

@Composable
fun PlaceCard(place: Place) {

    Column() {
        Card() {
            Text(place.title)
            Text(place.desription)
            Image(painterResource(place.image),
                "Guadalajara")

        }
    }
}