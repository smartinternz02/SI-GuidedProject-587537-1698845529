package com.example.owl_m_madfreak69

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import com.example.owl_m_madfreak69.ui.theme.OWLMTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.unit.dp
import androidx.annotation.DrawableRes
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @Composable
        fun ColorChangingButton(modifier: Modifier, text: String) {

        }

        @Composable
        fun ShapeChangingButton(modifier: Modifier, text: String) {
            TODO("Not yet implemented")
        }

        @Composable
        fun RaisingAndDepressingButton(modifier: Modifier, text: String) {

        }

        @Composable
        fun ThemeChangingButton(modifier: Modifier, text: String) {
            TODO("Not yet implemented")
        }
        setContent {
            @Composable
            fun InitialPage(
                appName: String,
                appDescription: String,
                onClickNext: () -> Unit
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // App image
                    Image(
                        painter = painterResource(R.drawable.owl_m),
                        contentDescription = appName,
                        modifier = Modifier.size(100.dp)
                    )

                    // App description
                    Text(
                        appName,
                        modifier = Modifier.padding(top = 16.dp),
                        style = MaterialTheme.typography.headlineLarge
                    )
                    Text(
                        appDescription,
                        modifier = Modifier.padding(top = 8.dp),
                        style = MaterialTheme.typography.bodyMedium,
                        textAlign = TextAlign.Center
                    )

                    // Next button
                    Button(
                        onClick = onClickNext,
                        modifier = Modifier.padding(top = 16.dp)
                    ) {
                        Text("Next")
                    }
                }
            }

            @Composable
            fun MyInitialPage() {
                InitialPage(
                    appName = "My Tutorial App",
                    appDescription = "This is a tutorial app for Material 3 using Jetpack Compose.",
                    onClickNext = { /* Navigate to the next page */ }
                )
            }
                    @Composable
                    fun SecondPage(onClickNext: () -> Unit) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            // Rounded rectangular color changing button
                            ColorChangingButton(
                                modifier = Modifier.padding(bottom = 16.dp),
                                text = "Color changing button"
                            )

                            // Text about color changing button
                            Text(
                                "This button changes color when you press it.",
                                modifier = Modifier.padding(bottom = 16.dp),
                                style = MaterialTheme.typography.bodyMedium
                            )

                            // Shape changing button
                            ShapeChangingButton(
                                modifier = Modifier.padding(bottom = 16.dp),
                                text = "Shape changing button"
                            )

                            // Text about shape changing button
                            Text(
                                "This button changes shape when you press it.",
                                modifier = Modifier.padding(bottom = 16.dp),
                                style = MaterialTheme.typography.bodyMedium
                            )

                            // Button that raises and depresses on each simultaneous press
                            RaisingAndDepressingButton(
                                modifier = Modifier.padding(bottom = 16.dp),
                                text = "Raising and depressing button"
                            )

                            // Text about raising and depressing button
                            Text(
                                "This button raises and depresses when you press it.",
                                modifier = Modifier.padding(bottom = 16.dp),
                                style = MaterialTheme.typography.bodyMedium
                            )

                            // Next button
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(horizontal = 16.dp)
                            ) {
                                // Your other UI elements here

                                Spacer(modifier = Modifier.weight(1f))

                                Button(
                                    onClick = onClickNext,
                                    modifier = Modifier
                                        .align(Alignment.End)
                                        .padding(bottom = 16.dp)
                                ) {
                                    Text("Next")
                                }
                            }
                        }
                    }

            @Composable
            fun ColorChangingButton(
                modifier: Modifier = Modifier,
                text: String,
                colors: ButtonColors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colorScheme.primary)
            ) {
                var color by remember { mutableStateOf(colors.backgroundColor) }

                Button(
                    onClick = { color = colors.disabledBackgroundColor },
                    modifier = modifier,
                    colors = colors.copy(backgroundColor = color),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(text)
                }
            }

            @Composable
            fun ShapeChangingButton(
                modifier: Modifier = Modifier,
                text: String,
                colors: ButtonColors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colorScheme.primary)
            ) {
                var shape by remember { mutableStateOf(RoundedCornerShape(16.dp)) }

                Button(
                    onClick = { shape = CircleShape },
                    modifier = modifier,
                    colors = colors,
                    shape = shape
                ) {
                    Text(text)
                }
            }

            @Composable
            fun RaisingAndDepressingButton(
                modifier: Modifier = Modifier,
                text: String,
                colors: ButtonColors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colorScheme.primary)
            ) {
                var isRaised by remember { mutableStateOf(false) }

                Button(
                    onClick = { isRaised = !isRaised },
                    modifier = modifier,
                    colors = colors,
                    elevation = if (isRaised) 8.dp else 0.dp
                ) {
                    Text(text)
                }
            }
            @Composable
            fun MySecondPage() {
                SecondPage(onClickNext = { /* Navigate to the next page */ })
            }
            @Composable
            fun ThirdPage(onClickNext: () -> Unit) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    // Theme changing button
                    ThemeChangingButton(
                        modifier = Modifier.padding(bottom = 16.dp),
                        text = "Change theme"
                    )

                    // Text about themes
                    Text(
                        "Material 3 offers two themes: light and dark. You can change the theme of your app by pressing the button above.",
                        modifier = Modifier.padding(top = 16.dp),
                        style = MaterialTheme.typography.bodyMedium
                    )

                    // Next button
                    Button(
                        onClick = onClickNext,
                        modifier = Modifier.align(Alignment.BottomEnd)
                    ) {
                        Text("Next")
                    }
                }
            }

            @Composable
            fun ThemeChangingButton(
                modifier: Modifier = Modifier,
                text: String,
                colors: ButtonColors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colorScheme.primary)
            ) {
                var isDarkTheme by remember { mutableStateOf(false) }

                Button(
                    onClick = { isDarkTheme = !isDarkTheme },
                    modifier = modifier,
                    colors = colors
                ) {
                    Text(text)
                }

                // Update the theme
                LaunchedEffect(isDarkTheme) {
                    LocalContentColor.current.setColorScheme(
                        if (isDarkTheme) {
                            MaterialTheme.colorScheme.dark
                        } else {
                            MaterialTheme.colorScheme.light
                        }
                    )
                }
            }

            @Composable
            fun MyThirdPage() {
                ThirdPage(onClickNext = { /* Navigate to the next page */ })
            }

            @Composable
            fun MyCustomCard(
                modifier: Modifier = Modifier,
                @DrawableRes image:Int,
                title:String,
                text:String,

                ) {

                var showFullText by remember {
                    mutableStateOf(false)
                }

                Card(
                    modifier = Modifier.animateContentSize(),
                    shape = MaterialTheme.shapes.medium,
                    colors = CardDefaults.cardColors(
                        containerColor = Color.LightGray
                    )
                ) {
                    Column {
                        Image(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            painter = painterResource(id = image),
                            contentDescription = null,
                            contentScale = ContentScale.Crop
                        )
                        Column (
                            modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp)
                        ) {
                            Text(
                                text = title,
                                color = Color.Black,
                                fontSize = 25.sp,
                                fontWeight = FontWeight.ExtraBold
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                modifier = Modifier.clickable {
                                    showFullText = !showFullText
                                },
                                text = text,
                                color = Color.Black.copy(alpha = 0.5f),
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold,
                                maxLines = if (showFullText) 100 else 2
                            )
                        }
                    }
                }
            }
        }
    }
}
