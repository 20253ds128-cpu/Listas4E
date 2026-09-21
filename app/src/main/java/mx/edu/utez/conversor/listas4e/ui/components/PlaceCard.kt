package mx.edu.utez.conversor.listas4e.ui.components

import android.R.attr.font
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.edu.utez.conversor.listas4e.R
import mx.edu.utez.conversor.listas4e.ui.model.Place

@Composable
fun PlaceCard(place: Place) {

    Column(modifier = Modifier.padding(10.dp, 5.dp)) {
        Card(colors = CardDefaults.cardColors(Color(200,180,111), Color.White)) {
            Column(modifier = Modifier.padding(10.dp)) {
                Text(place.title,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold)
                Text(place.desription,
                    fontSize = 18.sp,
                    fontStyle = FontStyle.Italic)
            }

            Image(painterResource(place.image),
                "Guadalajara",
                modifier = Modifier.fillMaxWidth().height(200.dp),
                contentScale = ContentScale.Crop)
        }
    }
}