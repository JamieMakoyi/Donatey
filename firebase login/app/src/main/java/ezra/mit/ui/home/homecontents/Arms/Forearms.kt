package ezra.mit.ui.home.homecontents.Arms

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
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
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.theme.AppTheme

@Composable
fun Forearms(viewModel: AuthViewModel?, navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column() {
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.BottomStart
            ) {
                Image(
                    painter = painterResource(R.drawable.forearms),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    text = "Forearm Workouts".padStart(5),
                    modifier = Modifier.padding(start = 10.dp)
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                Text(text = "Arm Circles Clockwise",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()

                Text(text = "Arm Circle Erclockwise",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()

                Text(text = "Leg Barbell Curl Left",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x20")
                Divider()

                Text(text = "Leg Barbell Curl Right",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x20")
                Divider()

                Text(text = "Floor Tricep Dips",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x18")
                Divider()

                Text(text = "Burpees",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x16")
                Divider()

                Text(text = "Doorway Curls Left",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x8")
                Divider()

                Text(text = "Doorway Curls Right",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x8")
                Divider()

                Text(text = "Modified Push Up Low Hold",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()

                Text(text = "Chest Press Pulse",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "18 seconds")
                Divider()


                Text(text = "Child's Pose",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()


                Text(text = "Wide Arm Stretch",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()


            }

        }
    }

}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun ForearmsPreviewLight() {
    AppTheme() {
        Forearms(null, rememberNavController())
    }

}
