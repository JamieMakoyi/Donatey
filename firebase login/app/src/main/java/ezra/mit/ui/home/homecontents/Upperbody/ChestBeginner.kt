package ezra.mit.ui.home.homecontents.Upperbody

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
fun ChestBeginner(viewModel: AuthViewModel?, navController: NavHostController) {
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
                    painter = painterResource(R.drawable.chest),
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
                    text = "Chest Beginner".padStart(5),
                    modifier = Modifier.padding(start = 10.dp)
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                Text(text = "Jumping Jacks",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()

                Text(text = "Incline Push Ups",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x10")
                Divider()

                Text(text = "Push Ups",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x8")
                Divider()

                Text(text = "Wide Arm Push Ups",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x8")
                Divider()

                Text(text = "Tricep Dips",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x10")
                Divider()

                Text(text = "Wide Arm Push Ups",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x6")
                Divider()

                Text(text = "Incline Push Ups",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x8")
                Divider()

                Text(text = "Tricep Dips",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x8")
                Divider()

                Text(text = "Knee Push Ups",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x8")
                Divider()

                Text(text = "Heel Touch",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x10")
                Divider()


                Text(text = "Chest Strech",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()


                Text(text = "Cobra Stretch",
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
fun ChestBeginnerPreviewLight() {
    AppTheme() {
        ChestBeginner(null, rememberNavController())
    }

}
