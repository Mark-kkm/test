package com.example.test

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HomeScreen() {

    Promotions()

}

@Composable
fun HomeTopAppBar(){
    TopAppBar(navigationIcon = {
        Icon(imageVector = ,contentDescription = null)
    }) {

    }
}

@Composable
fun Promotions(){
    LazyRow(
        Modifier.height(160.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            PromotionItem(imagePainter = painterResource(id = R.drawable.pizzhut))
        }
        item {
            PromotionItem(imagePainter = painterResource(id = R.drawable.baskin))
        }
    }
}

@Composable
fun PromotionItem(imagePainter: Painter) {
    Card(Modifier.width(300.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = 0.dp
    ){
        Row {
            Image(
                painter = imagePainter,
                contentDescription = null,
                modifier = Modifier.fillMaxHeight(1f),
                alignment = Alignment.CenterEnd,
                contentScale = ContentScale.Crop

            )
        }
    }
}


@Composable
fun Favorite() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Favorite",
            fontWeight = FontWeight.Bold,
            color = Black,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}


@Composable
fun Coupon() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .wrapContentSize(Alignment.Center)
    ) {
        Text(
            text = "Coupon",
            fontWeight = FontWeight.Bold,
            color = Black,
            modifier = Modifier.align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}
