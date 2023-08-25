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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import ezra.mit.navigation.ROUTE_BICEPSTRICEPS
import ezra.mit.navigation.ROUTE_FOREARMS
import ezra.mit.navigation.ROUTE_SHOULDERS
import ezra.mit.navigation.ROUTE_UPPER
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.theme.AppTheme

@Composable
fun Arms(viewModel: AuthViewModel?, navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    )
    Image(
        painter = painterResource(R.drawable.backgroudii),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    Column(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Text(
            text = "Arm Workouts",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier
            .height(30.dp))

        Card(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_SHOULDERS)
                }
                .fillMaxWidth()
                .height(230.dp)
                .padding(12.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(12.dp),
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier.weight(1f)) {
                    Image(
                        painter = painterResource(R.drawable.shoulder),
                        contentDescription = null, // Provide a proper description here
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Shoulders".padStart(5),
                        modifier = Modifier.padding(start = 10.dp),
                        color = Color.LightGray
                    )
                }

            }

        }


        Card(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_BICEPSTRICEPS)
                }
                .fillMaxWidth()
                .height(230.dp)
                .padding(12.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(12.dp),
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier.weight(1f)) {
                    Image(
                        painter = painterResource(R.drawable.arm3),
                        contentDescription = null, // Provide a proper description here
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Biceps & Triceps".padStart(5),
                        modifier = Modifier.padding(start = 10.dp),
                        color = Color.LightGray
                    )
                }

            }

        }


        Card(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_FOREARMS)
                }
                .fillMaxWidth()
                .height(230.dp)
                .padding(12.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(12.dp),
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier.weight(1f)) {
                    Image(
                        painter = painterResource(R.drawable.forearms),
                        contentDescription = null, // Provide a proper description here
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Forearm".padStart(5),
                        modifier = Modifier.padding(start = 10.dp),
                        color = Color.LightGray
                    )
                }

            }

        }




    }
}
@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun ArmsPreviewLight() {
    AppTheme() {
        Arms(null, rememberNavController())
    }

}
