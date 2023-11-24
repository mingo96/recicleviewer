package com.example.view.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.view.R
import com.example.view.classes.Superhero

fun getSuperHeroes():MutableList<Superhero>{
    val superHeroes = mutableListOf<Superhero>()
    superHeroes+= Superhero("Spiderman", "Petter Parker", "Marvel", R.drawable.spiderman)
    superHeroes+= Superhero("Wolverine", "James Howlett", "Marvel", R.drawable.logan)
    superHeroes+= Superhero("Batman", "Bruce Wayne", "DC", R.drawable.batman)
    superHeroes+= Superhero("Thor", "Thor Odinson", "Marvel", R.drawable.thor)
    superHeroes+= Superhero("Flash", "Jay Garrick", "DC", R.drawable.flash)
    superHeroes+= Superhero("Green Lantern", "Alan Scott", "DC", R.drawable.green_lantern)
    superHeroes+= Superhero("Wonder Woman", "Princess Diana", "DC", R.drawable.wonder_woman)
    return superHeroes
}

@Composable
fun SuperHeroView() {
    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(getSuperHeroes()) {
            ItemHero(superhero = it)
        }
    }
}

@Composable
fun ItemHero(superhero: Superhero){
    val context = LocalContext.current
    val mostrarMensaje : ()->Unit = {
        Toast.makeText(context, "${superhero.realName}", Toast.LENGTH_SHORT).show()
    }
    Card (
        Modifier
            .border(2.dp, Color.Red)
            .fillMaxWidth()
        ){
        Column (verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.clickable { mostrarMensaje() }){
            Image(painter = painterResource(id = superhero.photo),
                contentDescription = "foto de ${superhero.superHeroName}",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )
            Text(superhero.superHeroName)
            Text(superhero.realName)
            Text(text = superhero.publisher, Modifier.padding(start = 260.dp))
        }

    }
}