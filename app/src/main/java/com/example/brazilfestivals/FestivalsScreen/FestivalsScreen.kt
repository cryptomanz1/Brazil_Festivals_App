package com.example.brazilfestivals.FestivalsScreen

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import kotlinx.coroutines.launch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.window.Dialog
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import com.example.brazilfestivals.TestData
import com.example.brazilfestivals.TestDataItem

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FestivalsScreen() {
    var isWebMode by rememberSaveable { mutableStateOf(true) }
    var selectedImage by remember { mutableStateOf<TestDataItem?>(null) }
    val coroutineScope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Brazil Festivals")
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(Color.Yellow),
                actions = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            imageVector = Icons.Filled.Search,
                            contentDescription = "Search"
                        )

                    }
                    IconButton(onClick = {
                        coroutineScope.launch {
                            scaffoldState.snackbarHostState.showSnackbar(
                                message = "Added to favorites"
                            )
                        }
                    }) {
                        Icon(
                            imageVector = Icons.Filled.Star,
                            contentDescription = "Star"
                        )
                    }
                    IconButton(onClick = {
                        coroutineScope.launch {
                            scaffoldState.snackbarHostState.showSnackbar(
                                message = "Shared"
                            )
                        }
                    }) {
                        Icon(
                            imageVector = Icons.Filled.Share,
                            contentDescription = "Share"
                        )
                    }
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            if (!isWebMode) {
                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(15.dp),
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 70.dp)
                ) {
                    items(TestData.testItemsList) { image ->
                        Column(
                            modifier = Modifier
                                .clickable {
                                  selectedImage = image
                                    Log.d("FestivalsScreen", "Clicked on ${image.title}")
                                }
                        ) {
                            AsyncImage(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(300.dp),
                                contentScale = ContentScale.Crop,
                                model = image.url,
                                contentDescription = ""
                            )
                            Text(
                                text = image.title,
                                modifier = Modifier
                                    .padding(top = 10.dp)
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                color = Color.Black,
                                fontSize = 16.sp
                            )
                        }
                    }
                }
            }
            Button(
                onClick = {
                    // Измените режим при нажатии на кнопку Apply
                    isWebMode = !isWebMode
                },
                modifier = Modifier.fillMaxWidth(1f).padding(top = 60.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow)

            ) {
                Text(text = "Apply", color = Color.Black)
            }
            // Отображаем WebView только при isWebMode == true
            if (isWebMode) {
                WebViewComponent(url = "https://frukifyleb.com")
            }
        }
    }
    selectedImage?.let { image ->
        AlertDialog(
            onDismissRequest = {
                // Закрываем диалог при нажатии вне его области
                selectedImage = null
            },
            title = {
                Text(text = image.title)
            },
            text = {
                // Добавьте другие элементы для отображения дополнительной информации о картинке
                Text(text = "${image.description}")
            },
            confirmButton = {
                // Закрываем диалог при нажатии кнопки "OK"
                Button(onClick = { selectedImage = null }) {
                    Text("OK", color = Color.Yellow)
                }
            }
        )
    }
}








