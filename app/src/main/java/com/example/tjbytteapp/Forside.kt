package com.example.tjbytteapp

import android.icu.text.CaseMap.Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle

@Composable
fun Forside () {
    Background()
    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        GwapScreen()
    }

}




@Composable
fun Background() {
    Box () {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Background",
            modifier = Modifier
                .size(900.dp)
        )
    }
}

@Composable
fun GwapScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Gwap",
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        )
        Spacer(modifier = Modifier.height(40.dp))

        Button({},
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF81C7A5)),
            modifier = Modifier
                .width(250.dp)
                .height(50.dp)
        )
        { Text("Opret Profil", fontSize = 18.sp)}

        Spacer(modifier = Modifier.height(20.dp))

        Button({},
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF81C7A5)),
            modifier = Modifier
                .width(250.dp)
                .height(50.dp)
        )
        { Text("Log In", fontSize = 18.sp)}

    }
}



