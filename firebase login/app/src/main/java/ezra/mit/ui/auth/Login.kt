package ezra.mit.ui.auth

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import ezra.mit.R
import ezra.mit.data.Resource
import ezra.mit.navigation.ROUTE_ABOUT
import ezra.mit.navigation.ROUTE_HOME
import ezra.mit.navigation.ROUTE_LOGIN
import ezra.mit.navigation.ROUTE_SIGNUP
import ezra.mit.ui.theme.AppTheme
import ezra.mit.ui.theme.spacing
import kotlinx.coroutines.InternalCoroutinesApi

@OptIn(ExperimentalMaterial3Api::class, InternalCoroutinesApi::class)
@Composable
fun LoginScreen(viewModel: AuthViewModel?, navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val loginFlow = viewModel?.loginFlow?.collectAsState()

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
        painter = painterResource(R.drawable.loginw),
        contentDescription = null,
        modifier = Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )


        Card(
            Modifier
                .padding(25.dp),
            shape = RoundedCornerShape(32.dp)


        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(R.drawable.loginw),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )



                Column(
                    modifier = Modifier.fillMaxSize(),

                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Text(
                        text = "Welcome Back!"
                            .padStart(10),
                        fontWeight = FontWeight.Bold,
                        fontSize = (20.sp)


                    )

                    Spacer(modifier = Modifier.height(40.dp))

                    ConstraintLayout(

                    ) {

                        val (refHeader, refEmail, refPassword, refButtonLogin, refTextSignup, refLoader) = createRefs()
                        val spacing = MaterialTheme.spacing


                        OutlinedTextField(
                            value = email,
                            onValueChange = {
                                email = it
                            },
                            label = {
                                Text(text = "Email")
                            },
                            modifier = Modifier.constrainAs(refEmail) {
                                top.linkTo(refHeader.bottom, spacing.extraLarge)
                                start.linkTo(parent.start, spacing.large)
                                end.linkTo(parent.end, spacing.large)
                                width = Dimension.fillToConstraints
                            },
                            keyboardOptions = KeyboardOptions(
                                capitalization = KeyboardCapitalization.None,
                                autoCorrect = false,
                                keyboardType = KeyboardType.Email,
                                imeAction = ImeAction.Next
                            )
                        )

                        OutlinedTextField(
                            value = password,
                            onValueChange = {
                                password = it
                            },
                            label = {
                                Text(text = "Password")
                            },
                            visualTransformation = PasswordVisualTransformation(),
                            modifier = Modifier.constrainAs(refPassword) {
                                top.linkTo(refEmail.bottom, spacing.medium)
                                start.linkTo(parent.start, spacing.large)
                                end.linkTo(parent.end, spacing.large)
                                width = Dimension.fillToConstraints
                            },
                            keyboardOptions = KeyboardOptions(
                                capitalization = KeyboardCapitalization.None,
                                autoCorrect = false,
                                keyboardType = KeyboardType.Password,
                                imeAction = ImeAction.Done
                            )
                        )

                        Button(
                            onClick = {
                                viewModel?.login(email, password)
                            },
                            modifier = Modifier.constrainAs(refButtonLogin) {
                                top.linkTo(refPassword.bottom, spacing.large)
                                start.linkTo(parent.start, spacing.large)
                                end.linkTo(parent.end, spacing.large)
                                width = Dimension.fillToConstraints
                            }
                        ) {
                            Text(text = "Login")
                        }


                        Text(
                            modifier = Modifier
                                .constrainAs(refTextSignup) {
                                    top.linkTo(refButtonLogin.bottom, spacing.medium)
                                    start.linkTo(parent.start, spacing.extraLarge)
                                    end.linkTo(parent.end, spacing.extraLarge)
                                }
                                .clickable {
                                    navController.navigate(ROUTE_SIGNUP) {
                                        popUpTo(ROUTE_LOGIN) { inclusive = true }
                                    }
                                },
                            text = "No account yet? Register Here",
                            style = MaterialTheme.typography.bodyLarge,
                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface
                        )

                        loginFlow?.value?.let {
                            when (it) {
                                is Resource.Failure -> {
                                    val context = LocalContext.current
                                    Toast.makeText(context, it.exception.message, Toast.LENGTH_LONG)
                                        .show()
                                }

                                Resource.Loading -> {
                                    CircularProgressIndicator(
                                        modifier = Modifier.constrainAs(
                                            refLoader
                                        ) {
                                            top.linkTo(parent.top)
                                            bottom.linkTo(parent.bottom)
                                            start.linkTo(parent.start)
                                            end.linkTo(parent.end)
                                        })
                                }

                                is Resource.Success -> {
                                    LaunchedEffect(Unit) {
                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_LOGIN) { inclusive = true }
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
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun LoginScreenPreviewLight() {
    AppTheme {
        LoginScreen(null, rememberNavController())
    }
}

