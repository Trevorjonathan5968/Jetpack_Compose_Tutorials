package com.example.android_test1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColor
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.EaseInOut
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateSizeAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults.ContentPadding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_test1.ui.theme.Android_test1Theme
import kotlinx.coroutines.launch
import kotlin.random.Random
import androidx.compose.ui.graphics.Color as Color


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val fontFamilyCaveat= FontFamily(
//            Font(R.font.caveat_variablefont_wght, FontWeight.Black),
//        )

        setContent {
            Navigation()
            }

            }

            }



//Animation/ text/snackbar

/*      setContent {
            val snackbarHostState= remember { SnackbarHostState() }
            val scope= rememberCoroutineScope()
            var textFieldState by remember{ mutableStateOf("") }
            var boxSize by remember{mutableStateOf(200.dp)}
            val size by animateDpAsState(
                targetValue = boxSize,
                tween(
                    durationMillis = 1000,
                    easing = LinearOutSlowInEasing)
                )
            val infiniteTransition= rememberInfiniteTransition()
            val color by infiniteTransition.animateColor(
                initialValue = Color.White,
                targetValue= Color.LightGray,
                animationSpec = infiniteRepeatable(tween(durationMillis = 1000),
                repeatMode= RepeatMode.Reverse
                )
            )

            Scaffold(
                modifier= Modifier.fillMaxSize(),
                snackbarHost = { SnackbarHost(snackbarHostState) }
            ){contentPadding-> contentPadding
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 30.dp)
                )
                {
                    OutlinedTextField(
                        value= textFieldState,
                        label= { Text("Enter your name")},
                        onValueChange = { textFieldState= it},
                        singleLine = true,
                        modifier= Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(onClick = {
                        scope.launch {
                            snackbarHostState.showSnackbar("Hello $textFieldState", duration = SnackbarDuration.Short)
                        }
                    }) {
                        Text( "Please Greet Me")

                    }
                    Card( shape = RoundedCornerShape(15.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(size)
                                .background(color),
                            contentAlignment = Alignment.Center,
                        ) {
                            Button(onClick = {
                                boxSize += 20.dp
                            }
                            ) {
                                Text(text = "Increase Box Size")

                            }
                        }
                    }
                    Spacer(modifier = Modifier.size(10.dp))
                    Button(onClick = { /*TODO*/ }) { Text("Next Page")}
                }
            }

            }
*/
/*
//State Changes Colors example

setContent {
           Column (Modifier.fillMaxSize()){
               val color= remember{
                   mutableStateOf(Color.Yellow)
               }
               ColorBox(
                   Modifier.weight(1f).fillMaxSize(),
               ){
                   color.value = it
               }
               Box(modifier = Modifier
                   .background(color.value)
                   .weight(1f)
                   .fillMaxSize()
               )

           }
           }


    }
}

@Composable
fun ColorBox(
    modifier: Modifier= Modifier,
    updateColor: (Color)-> Unit
){
   //Variable to change state, will remember last state

    Box(modifier= modifier
        .background(Color.Red)//State variable implementation
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat(),//R
                    Random.nextFloat(),//G
                    Random.nextFloat(),//B
                1f
            ))
            //Random RGB values
        }
    )
}

 */

























//           Box(modifier = Modifier
//               .fillMaxSize()
//               .background(Color(0xFF101010))
//           ) {
//               Text(
//                   text= buildAnnotatedString {
//                       withStyle(
//                           style = SpanStyle(
//                               color = Color.Green,
//                               fontSize =70.sp,
//                           )
//                       ){
//                           append("T")
//                       }
//                       append("revor ")
//                       withStyle(
//                           style = SpanStyle(
//                               color = Color.Green,
//                               fontSize =70.sp,
//                           )
//                       ){
//                           append("A")
//                       }
//                       append("gola")
//                   },
//                   color = Color.White,
//                   fontSize =50.sp,
//                   fontFamily= fontFamilyCaveat,
//                   fontWeight = FontWeight.Bold,
//                   fontStyle = FontStyle.Italic,
//                   textAlign = TextAlign.Center,
//                   textDecoration = TextDecoration.Underline,
//
//                   modifier = Modifier
//                       .align(Alignment.Center)
//               )










//            val painter= painterResource(id = R.drawable.food1)
//            val contentDescription= "Food being served on a plate"
//            val title= "Delicious healthy servings"
//
//            Row {
//                Box(
//                    modifier = Modifier
//                        .fillMaxWidth(0.5f)
//                        .padding(10.dp)
//                ) {
//                    ImageCard(
//                        painter = painter,
//                        contentDescription = contentDescription,
//                        title = title
//                    )
//                }
//                Box(modifier = Modifier
//                    .fillMaxWidth(0.5f)
//                    .padding(10.dp)
//                ){
//                    ImageCard(painter = painter, contentDescription = contentDescription, title = title)
//                }
//            }




    //Image card with fading background
//    @Composable
//    fun ImageCard(
//        painter: Painter,
//        contentDescription: String,
//        title: String,
//        modifier: Modifier= Modifier
//
//    ){
//        Card(
//            modifier= modifier.fillMaxWidth(),
//            shape = RoundedCornerShape(15.dp),
//            elevation = CardDefaults.cardElevation(defaultElevation = 5.dp)
//            ){
//            Box(modifier= modifier.height(300.dp)){
//                Image(
//                    painter = painter,
//                    contentDescription = contentDescription,
//                    contentScale = ContentScale.Crop
//                )
//                Box(modifier = Modifier
//                    .fillMaxSize()
//                    .background(
//                        Brush.verticalGradient(
//                            colors = listOf(
//                                Colors.Transparent,
//                                Colors.Black
//                            ),
//                            startY = 250f
//                        )
//                    )
//                )
//                Box(modifier = Modifier
//                    .fillMaxSize()
//                    .padding(12.dp),
//                    contentAlignment = Alignment.BottomCenter
//                )
//                {
//                    Text(title, style = TextStyle(color = Colors.White, fontSize = 16.sp))
//                }
//            }
//        }
//    }