package com.example.view.screens

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