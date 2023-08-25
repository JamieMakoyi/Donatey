package ezra.mit.ui.home

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ezra.mit.R
import ezra.mit.navigation.ROUTE_ABS
import ezra.mit.navigation.ROUTE_ARMS
import ezra.mit.navigation.ROUTE_CHEST
import ezra.mit.navigation.ROUTE_LEGS
import ezra.mit.navigation.ROUTE_LOWER
import ezra.mit.navigation.ROUTE_UPPER
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.home.homecontents.Upperbody.Upperbody
import ezra.mit.ui.theme.AppTheme
import ezra.mit.ui.theme.spacing


@Composable
fun HomeScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.backgroudii),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column() {


        Box(
            modifier = Modifier
                .height(350.dp)

        ) {
            Column()

            {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,

                    ) {
                    Column(
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Featured Workouts",
                            fontWeight = FontWeight.Bold,
                            fontSize = (24.sp)

                        )

                    }
                }
                Spacer(
                    modifier = Modifier
                        .height(0.dp)
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.Transparent),

                ) {
                    Box(
                        modifier = Modifier
                            .height(300.dp)
                            .background(Color.Transparent)

                    ) {

                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .fillMaxWidth()
                                .background(Color.Transparent),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.Bottom
                        ) {

                            Card(
                                modifier = Modifier
                                    .clickable {
                                        navController.navigate(ROUTE_UPPER)

                                    }
                                    .fillMaxHeight()
                                    .width(200.dp)
                                    .padding(12.dp)
                                    .background(Color.Transparent),
                                shape = RoundedCornerShape(12.dp),
                            ) {
                                Column(modifier = Modifier.fillMaxSize()) {
                                    Box(modifier = Modifier.weight(1f)) {
                                        Image(
                                            painter = painterResource(R.drawable.upperbody),
                                            contentDescription = null, // Provide a proper description here
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.Crop
                                        )
                                        Text(
                                            text = "Upper Body".padStart(5),
                                            modifier = Modifier.padding(start = 10.dp),
                                            color = Color.LightGray
                                        )
                                    }

                                }
                            }

                            Card(
                                modifier = Modifier
                                    .clickable {
                                        navController.navigate(ROUTE_LOWER) }
                                    .height(250.dp)
                                    .width(200.dp)
                                    .padding(12.dp),
                                shape = RoundedCornerShape(12.dp),


                                ) {
                                Column(modifier = Modifier.fillMaxSize()) {
                                    Box(modifier = Modifier.weight(1f)) {
                                        Image(
                                            painter = painterResource(R.drawable.legs),
                                            contentDescription = null, // Provide a proper description here
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.Crop
                                        )
                                        Text(
                                            text = "Lower Body".padStart(5),
                                            modifier = Modifier.padding(start = 10.dp),
                                            color = Color.LightGray
                                        )
                                    }

                                }

                            }

                        }

                    }

                }
            }
        }

        Spacer(
            modifier = Modifier
                .height(0.dp)
        )


            Box(
            modifier = Modifier
                .height(480.dp)

            ) {
                Column()

                 {
                     Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,

                        ) {
                        Column(
                        verticalArrangement = Arrangement.Center
                            ) {
                            Text(
                            text = "What are we doing today?",
                            fontWeight = FontWeight.Bold,
                            fontSize = (24.sp)
                            )

                            }
                }
                     Spacer(
                        modifier = Modifier
                        .height(0.dp)
                            )
                        Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Transparent),

                        ) {
                            Box(
                                modifier = Modifier
                                    .height(480.dp)
                                    .background(Color.Transparent)

                                ) {

                                Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.Top
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .background(Color.Transparent)
                                            .verticalScroll(scrollState)
                                    ) {


                                        Card(
                                            modifier = Modifier
                                                .clickable {
                                                    navController.navigate(ROUTE_CHEST)
                                                }
                                                .height(200.dp)
                                                .width(200.dp)
                                                .padding(12.dp),
                                            shape = RoundedCornerShape(12.dp),


                                            ) {
                                            Column(modifier = Modifier.fillMaxSize()) {
                                                Box(modifier = Modifier.weight(0.5f)) {
                                                    Image(
                                                        painter = painterResource(R.drawable.chests),
                                                        contentDescription = null,
                                                        modifier = Modifier.fillMaxSize(),
                                                        contentScale = ContentScale.Crop
                                                    )
                                                    Text(
                                                        text = "Chest".padStart(5),
                                                        modifier = Modifier.padding(start = 10.dp),
                                                        color = Color.LightGray
                                                    )
                                                }

                                            }
                                        }

                                        Card(
                                            modifier = Modifier
                                                .clickable {
                                                    navController.navigate(ROUTE_LEGS)
                                                }
                                                .height(200.dp)
                                                .width(200.dp)
                                                .padding(12.dp),
                                            shape = RoundedCornerShape(12.dp),


                                            ) {
                                            Column(modifier = Modifier.fillMaxSize()) {
                                                Box(modifier = Modifier.weight(1f)) {
                                                    Image(
                                                        painter = painterResource(R.drawable.upperlegs),
                                                        contentDescription = null,
                                                        modifier = Modifier.fillMaxSize(),
                                                        contentScale = ContentScale.Crop
                                                    )
                                                    Text(
                                                        text = "Legs".padStart(5),
                                                        modifier = Modifier.padding(start = 10.dp),
                                                        color = Color.LightGray
                                                    )
                                                }

                                            }

                                        }



                                    }

                                    Spacer(
                                        modifier = Modifier
                                            .height(10.dp)
                                    )

                                    Column(

                                    ) {
                                        Card(
                                            modifier = Modifier
                                                .clickable {
                                                    navController.navigate(ROUTE_ARMS)
                                                }
                                                .height(200.dp)
                                                .width(200.dp)
                                                .padding(12.dp),
                                            shape = RoundedCornerShape(12.dp),
                                        ) {
                                            Column(modifier = Modifier.fillMaxSize()) {
                                                Box(modifier = Modifier.weight(1f)) {
                                                    Image(
                                                        painter = painterResource(R.drawable.arms),
                                                        contentDescription = null,
                                                        modifier = Modifier.fillMaxSize(),
                                                        contentScale = ContentScale.Crop
                                                    )
                                                    Text(
                                                        text = "Arms",
                                                        modifier = Modifier.padding(start = 10.dp),
                                                        color = Color.LightGray
                                                    )
                                                }

                                            }
                                        }

                                        Card(
                                            modifier = Modifier
                                                .clickable {
                                                    navController.navigate(ROUTE_ABS)
                                                }
                                                .height(200.dp)
                                                .width(200.dp)
                                                .padding(12.dp),
                                            shape = RoundedCornerShape(12.dp),

                                            ) {
                                            Column(modifier = Modifier.fillMaxSize()) {
                                                Box(modifier = Modifier.weight(1f)) {
                                                    Image(
                                                        painter = painterResource(R.drawable.abs),
                                                        contentDescription = null,
                                                        modifier = Modifier.fillMaxSize(),
                                                        contentScale = ContentScale.Crop
                                                    )
                                                    Text(
                                                        text = "Abs",
                                                        modifier = Modifier.padding(start = 10.dp),
                                                        color = Color.LightGray
                                                    )
                                                }

                                            }

                                        }


                                }
                                }

                    }


                }


            }
        }

    }
}
}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AppTheme() {
        HomeScreen(null, rememberNavController())
    }

}

