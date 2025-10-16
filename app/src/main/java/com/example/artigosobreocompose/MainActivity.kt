package com.example.artigosobreocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artigosobreocompose.ui.theme.ArtigoSobreOComposeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtigoSobreOComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleApp()
                }
            }
        }
    }
}

@Composable
fun ArticleApp() {
    ArticleCard(
        imagePainter = painterResource(R.drawable.bg_compose_background),
        articleTitle = stringResource(R.string.jetpack_compose_tutorial),
        introduction = stringResource(R.string.introduction_text),
        articleBody = stringResource(R.string.body_text)
    )
}

@Composable
fun ArticleCard(
    imagePainter: Painter,
    articleTitle: String,
    introduction: String,
    articleBody: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Image(
            painter = imagePainter,
            contentDescription = null
        )
        Text(
            text = articleTitle,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = introduction,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = articleBody,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ArtigoSobreOComposeTheme {
        ArticleApp()
    }
}