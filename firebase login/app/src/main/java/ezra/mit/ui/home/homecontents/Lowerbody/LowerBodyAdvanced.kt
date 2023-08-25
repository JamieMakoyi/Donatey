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
fun LowerbodyAdvanced(viewModel: AuthViewModel?, navController: NavHostController) {
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
                    painter = painterResource(R.drawable.legsss),
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
                    text = "Lower Body Advanced".padStart(5),
                    modifier = Modifier.padding(start = 10.dp)
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                Text(text = "Burpees",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x10")
                Divider()

                Text(text = "Squats",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x28")
                Divider()

                Text(text = "Bottom Leg Lift Left",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x24")
                Divider()

                Text(text = "Bottom Leg Lift Right",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x24")
                Divider()

                Text(text = "Curtsy Lunges Left",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x28")
                Divider()

                Text(text = "Curtsy Lunges Right",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x28")
                Divider()

                Text(text = "Jumping Squats",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x30")
                Divider()

                Text(text = "Wall Sit",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()

                Text(text = "Left Quad Stretch With Wall",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()

                Text(text = "Right Quad Stretch With Wall",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()


                Text(text = "Lying Butterfly Stretch",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "30 seconds")
                Divider()


                Text(text = "Calf Stretches",
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
fun LowerbodyAdvancedPreviewLight() {
    AppTheme() {
        LowerbodyAdvanced(null, rememberNavController())
    }

}
