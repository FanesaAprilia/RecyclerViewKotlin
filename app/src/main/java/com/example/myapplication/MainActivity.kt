package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.law,
                nameSuperhero = "L Lawliet",
                descSuperhero = "Death Note",
                rateSuperhero = "10/10"
            ),
            Superhero(
                R.drawable.itachii,
                nameSuperhero = "Uchiha Itachi",
                descSuperhero = "Naruto: Shippuden",
                rateSuperhero = "10/10"
            ),
            Superhero(
                R.drawable.giyu,
                nameSuperhero = "Tomioka Giyu",
                descSuperhero = "Demon Slayer",
                rateSuperhero = "9/10"
            ),
            Superhero(
                R.drawable.normaan,
                nameSuperhero = "Norman",
                descSuperhero = "The Promised Neverland",
                rateSuperhero = "10/10"
            ),
            Superhero(
                R.drawable.akame,
                nameSuperhero = "Akame",
                descSuperhero = "Akame ga Kill!",
                rateSuperhero = "9/10"
            ),
            Superhero(
                R.drawable.kamado,
                nameSuperhero = "Kamado Tanjirou",
                descSuperhero = "Demon Slayer",
                rateSuperhero = "10/10"
            ),
            Superhero(
                R.drawable.nar,
                nameSuperhero = "Uzumaki Naruto",
                descSuperhero = "Naruto: Shippuden",
                rateSuperhero = "10/10"
            ),
            Superhero(
                R.drawable.nezuko,
                nameSuperhero = "Kamado Nezuko",
                descSuperhero = "Demon Slayer",
                rateSuperhero = "9.5/10"
            ),
            Superhero(
                R.drawable.killuua,
                nameSuperhero = "Killua Zoldyck",
                descSuperhero = "Hunter x Hunter",
                rateSuperhero = "10/10"
            ),
            Superhero(
                R.drawable.gaaraa,
                nameSuperhero = "Gaara",
                descSuperhero = "Naruto: Shippuden",
                rateSuperhero = "9.5/10"
            ),
            Superhero(
                R.drawable.conann,
                nameSuperhero = "Edogawa Conan",
                descSuperhero = "Detectif Conan",
                rateSuperhero = "10/10"
            ),
            Superhero(
                R.drawable.gon,
                nameSuperhero = "Gon Freecss",
                descSuperhero = "Hunter x Hunter",
                rateSuperhero = "10/10"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdaptor(this, superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}