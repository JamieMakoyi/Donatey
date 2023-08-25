package ezra.mit.ui.home.homecontents.Abs

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
import androidx.compose.foundation.rememberScrollState
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
fun LowerAbs(viewModel: AuthViewModel?, navController: NavHostController) {
    val scrollState = rememberScrollState()
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
        ) {
            Box(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.BottomStart
            ) {
                Image(
                    painter = painterResource(R.drawable.lowerabs),
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
                    text = "Lower Abs Workout".padStart(5),
                    modifier = Modifier.padding(start = 10.dp)
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxSize()
                    .padding(10.dp)
            ) {
                Text(text = "Bridges",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x20")
                Divider()

                Text(text = "Side Bridges Left",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x20")
                Divider()

                Text(text = "Side Bridges Right",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x20")
                Divider()

                Text(text = "Abdominal Crunches",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x30")
                Divider()

                Text(text = "Superman",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x24")
                Divider()

                Text(text = "Side Plank Right",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "20 seconds")
                Divider()

                Text(text = "Side Plank Left",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "20 seconds")
                Divider()

                Text(text = "Inchworms",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x18")
                Divider()

                Text(text = "Russian Twist",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x48")
                Divider()

                Text(text = "Standing Bicycle Crunches",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x40")
                Divider()


                Text(text = "Bridges",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp)
                Text(text = "x20")
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
fun LowerAbsPreviewLight() {
    AppTheme() {
        LowerAbs(null, rememberNavController())
    }

}
