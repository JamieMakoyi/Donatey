package ezra.mit.ui.home.homecontents.Lowerbody

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
fun LowerbodyBeginner(viewModel: AuthViewModel?, navController: NavHostController) {
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
                    painter = painterResource(R.drawable.legss),
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
                    text = "Lower Body Beginner".padStart(5),
                    modifier = Modifier.padding(start = 10.dp)
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                Text(text = "Side Hops",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()

                Text(text = "Squats",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x12")
                Divider()

                Text(text = "Side Lying Leg Lift Left",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x12")
                Divider()

                Text(text = "Side Lying Leg Lift Right",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x12")
                Divider()

                Text(text = "Backward Lunges",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x14")
                Divider()

                Text(text = "Donkey Kicks Left",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x16")
                Divider()

                Text(text = "Donkey Kicks Right",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "20 seconds")
                Divider()

                Text(text = "Wall Calf Raises",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x12")
                Divider()

                Text(text = "Knee To Chest Stretch Left",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()

                Text(text = "Knee To Chest Stretch Right",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()


                Text(text = "Calf Stretch Left",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()


                Text(text = "Calf Stretch Right",
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
fun LowerbodyBeginnerPreviewLight() {
    AppTheme() {
        LowerbodyBeginner(null, rememberNavController())
    }

}
