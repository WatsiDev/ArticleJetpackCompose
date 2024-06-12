package com.watsidev.practicandojetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
//import androidx.compose.material.icons.materialIcon
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.watsidev.practicandojetpack.ui.theme.PracticandoJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticandoJetpackTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    GreetingImage(
                        title = stringResource(R.string.jetpack_compose_tutorial),
                        contentOne = stringResource(R.string.contentOne),
                        contentTwo = stringResource(R.string.contentTwo)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingImage(title: String,
                  contentOne: String,
                  contentTwo: String,
                  modifier: Modifier = Modifier
                ){
    val image = painterResource(R.drawable.bg_compose_background)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth
        )
        GreetingText(
            title = title,
            contentOne = contentOne,
            contentTwo =contentTwo,
            modifier = Modifier
                .fillMaxSize()
        )
    }
}

@Composable
fun GreetingText(title: String, contentOne: String, contentTwo: String, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = contentOne,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 16.dp)
                .padding(end = 16.dp)
        )
        Text(
            text = contentTwo,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}



@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    PracticandoJetpackTheme {
        GreetingImage(title = stringResource(R.string.jetpack_compose_tutorial) ,
            contentOne = stringResource(R.string.contentOne),
            contentTwo = stringResource(R.string.contentTwo)
        )
    }
}