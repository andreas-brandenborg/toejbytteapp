package com.example.tjbytteapp

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tjbytteapp.ui.theme.TøjbytteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TøjbytteAppTheme {
                MainScreen()
                }
            }
        }
    }

@Composable
fun MainScreen() {
    Column {
        Swipe("Smarte Loafers", "Er du lige startet på CBS, og mangler et par CBS sko? Så kan du bytte for de her bad boys, så du kan passe ind!")
        Navigation()
    }
}


@Composable
fun Navigation() {
    Row (horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()){
        Button(onClick = {}) { }
        Button(onClick = {}) { }
        Button(onClick = {}) { }
    }
}

@Composable
fun Swipe(postTitle: String, description: String) {
    Box (){
        Image(painter = painterResource(id = R.drawable.shoes),
            contentDescription = "Shoes",
            modifier = Modifier
                .size(800.dp))
        Box(
            modifier = Modifier
                .matchParentSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(Color.Transparent, Color.Black)
                    )
                )
        )
            Column(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(8.dp)
            ) {
                Text(
                    text = postTitle,
                    fontSize = 45.sp,
                    color = Color.White
                )
                Text(
                    text = description,
                    fontSize = 18.sp,
                    color = Color.White
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .padding(18.dp)
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ja),
                        contentDescription = "Ja",
                        Modifier.size(90.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.favorit),
                        contentDescription = "Favorite",
                        Modifier.size(90.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.nej),
                        contentDescription = "Nej",
                        Modifier.size(90.dp)
                    )
                }
            }

        }
    }
