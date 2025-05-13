package br.senai.sp.jandira.rickandmorty.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.rickandmorty.R

@Composable
    fun HomeScreen (modifier: Modifier = Modifier){
        Box(
            modifier = Modifier.fillMaxSize()
        )
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(R.drawable.rickandmorty),
            contentDescription = "Rick and Morty background ",
            contentScale = ContentScale.Crop
        )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(color = 0xaa000000))
            )
    }


@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview(){
    HomeScreen()

}