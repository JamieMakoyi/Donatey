package ezra.mit.ui.home.homecontents.Upperbody

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import ezra.mit.navigation.ROUTE_ABSADVANCED
import ezra.mit.navigation.ROUTE_ABSBEGINNER
import ezra.mit.navigation.ROUTE_ABSINTERMEDIATE
import ezra.mit.navigation.ROUTE_ARMSADVANCED
import ezra.mit.navigation.ROUTE_ARMSBEGINNER
import ezra.mit.navigation.ROUTE_ARMSINTERMEDIATE
import ezra.mit.navigation.ROUTE_CHESTADVANCED
import ezra.mit.navigation.ROUTE_CHESTBEGINNER
import ezra.mit.navigation.ROUTE_CHESTINTERMEDIATE
import ezra.mit.navigation.ROUTE_UPPER
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.theme.AppTheme

@Composable
fun Upperbody(viewModel: AuthViewModel?, navController: NavHostController) {
    val scrollState = rememberScrollState()
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
            .verticalScroll(scrollState)
    ) {
        Text(
            text = "Upper Body",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Text(text = "Beginner")

        Card(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_ARMSBEGINNER)
                }
                .fillMaxWidth()
                .height(100.dp)
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
                        text = "Arms Beginner".padStart(5),
                        modifier = Modifier.padding(start = 10.dp),
                        color = Color.LightGray
                    )
                }

            }

        }

        Card(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_CHESTBEGINNER)
                }
                .fillMaxWidth()
                .height(100.dp)
                .padding(12.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(12.dp),
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier.weight(1f)) {
                    Image(
                        painter = painterResource(R.drawable.chest),
                        contentDescription = null, // Provide a proper description here
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Chest Beginner".padStart(5),
                        modifier = Modifier.padding(start = 10.dp),
                        color = Color.LightGray
                    )
                }

            }

        }

        Card(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_ABSBEGINNER)
                }
                .fillMaxWidth()
                .height(100.dp)
                .padding(12.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(12.dp),
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier.weight(1f)) {
                    Image(
                        painter = painterResource(R.drawable.abs),
                        contentDescription = null, // Provide a proper description here
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Abs Beginner".padStart(5),
                        modifier = Modifier.padding(start = 10.dp),
                        color = Color.LightGray
                    )
                }

            }

        }

        Text(text = "Intermediate")

        Card(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_ARMSINTERMEDIATE)
                }
                .fillMaxWidth()
                .height(100.dp)
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
                        text = "Arms Intermediate".padStart(5),
                        modifier = Modifier.padding(start = 10.dp),
                        color = Color.LightGray
                    )
                }

            }

        }

        Card(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_CHESTINTERMEDIATE)
                }
                .fillMaxWidth()
                .height(100.dp)
                .padding(12.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(12.dp),
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier.weight(1f)) {
                    Image(
                        painter = painterResource(R.drawable.chest),
                        contentDescription = null, // Provide a proper description here
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Chest Intermediate".padStart(5),
                        modifier = Modifier.padding(start = 10.dp),
                        color = Color.LightGray
                    )
                }

            }

        }


        Card(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_ABSINTERMEDIATE)
                }
                .fillMaxWidth()
                .height(100.dp)
                .padding(12.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(12.dp),
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier.weight(1f)) {
                    Image(
                        painter = painterResource(R.drawable.abs),
                        contentDescription = null, // Provide a proper description here
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Abs Intermediate".padStart(5),
                        modifier = Modifier.padding(start = 10.dp),
                        color = Color.LightGray
                    )
                }

            }

        }

        Text(text = "Advanced")

        Card(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_ARMSADVANCED)
                }
                .fillMaxWidth()
                .height(100.dp)
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
                        text = "Arms Advanced".padStart(5),
                        modifier = Modifier.padding(start = 10.dp),
                        color = Color.LightGray
                    )
                }

            }

        }


        Card(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_CHESTADVANCED)
                }
                .fillMaxWidth()
                .height(100.dp)
                .padding(12.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(12.dp),
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier.weight(1f)) {
                    Image(
                        painter = painterResource(R.drawable.chest),
                        contentDescription = null, // Provide a proper description here
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Chest Advanced".padStart(5),
                        modifier = Modifier.padding(start = 10.dp),
                        color = Color.LightGray
                    )
                }

            }

        }

        Card(
            modifier = Modifier
                .clickable {
                    navController.navigate(ROUTE_ABSADVANCED)
                }
                .fillMaxWidth()
                .height(100.dp)
                .padding(12.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(12.dp),
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                Box(modifier = Modifier.weight(1f)) {
                    Image(
                        painter = painterResource(R.drawable.abs),
                        contentDescription = null, // Provide a proper description here
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "Abs Advanced".padStart(5),
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
fun UpperbodyPreviewLight() {
    AppTheme() {
        Upperbody(null, rememberNavController())
    }

}
