package ezra.mit.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ezra.mit.ui.about.AboutScreen
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.auth.LoginScreen
import ezra.mit.ui.auth.SignupScreen
import ezra.mit.ui.home.HomeScreen
import ezra.mit.ui.home.homecontents.Abs.Abs
import ezra.mit.ui.home.homecontents.Abs.LowerAbs
import ezra.mit.ui.home.homecontents.Abs.UpperAbs
import ezra.mit.ui.home.homecontents.Arms.Arms
import ezra.mit.ui.home.homecontents.Arms.BicepsTriceps
import ezra.mit.ui.home.homecontents.Arms.Forearms
import ezra.mit.ui.home.homecontents.Arms.Shoulders
import ezra.mit.ui.home.homecontents.Chest.Chest
import ezra.mit.ui.home.homecontents.Chest.KillerChest
import ezra.mit.ui.home.homecontents.Chest.LoseChest
import ezra.mit.ui.home.homecontents.Legs.Legs
import ezra.mit.ui.home.homecontents.Legs.LowerLegs
import ezra.mit.ui.home.homecontents.Legs.UpperLegs
import ezra.mit.ui.home.homecontents.Lowerbody.Lowerbody
import ezra.mit.ui.home.homecontents.Lowerbody.LowerbodyAdvanced
import ezra.mit.ui.home.homecontents.Lowerbody.LowerbodyBeginner
import ezra.mit.ui.home.homecontents.Lowerbody.LowerbodyIntermediate
import ezra.mit.ui.home.homecontents.Upperbody.AbsAdvanced
import ezra.mit.ui.home.homecontents.Upperbody.AbsBeginner
import ezra.mit.ui.home.homecontents.Upperbody.AbsIntermediate
import ezra.mit.ui.home.homecontents.Upperbody.ArmsAdvanced
import ezra.mit.ui.home.homecontents.Upperbody.ArmsBeginner
import ezra.mit.ui.home.homecontents.Upperbody.ArmsIntermediate
import ezra.mit.ui.home.homecontents.Upperbody.ChestAdvanced
import ezra.mit.ui.home.homecontents.Upperbody.ChestBeginner
import ezra.mit.ui.home.homecontents.Upperbody.ChestIntermediate
import ezra.mit.ui.home.homecontents.Upperbody.Upperbody

@Composable
fun AppNavHost(
    viewModel: AuthViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_LOGIN
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(viewModel, navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(viewModel, navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(viewModel, navController)
        }
        composable(ROUTE_ABOUT) {
            AboutScreen(viewModel, navController)
        }
        composable(ROUTE_UPPER) {
            Upperbody(viewModel, navController)
        }
        composable(ROUTE_LOWER){
            Lowerbody(viewModel, navController)
        }
        composable(ROUTE_ARMS){
            Arms(viewModel, navController)
        }
        composable(ROUTE_ABS){
            Abs(viewModel, navController)
        }
        composable(ROUTE_CHEST){
            Chest(viewModel, navController)
        }
        composable(ROUTE_LEGS){
            Legs(viewModel, navController)
        }
        composable(ROUTE_LOWERLEGS){
            LowerLegs(viewModel, navController)
        }
        composable(ROUTE_UPPERLEGS){
            UpperLegs(viewModel, navController)
        }
        composable(ROUTE_KCHEST){
            KillerChest(viewModel, navController)
        }
        composable(ROUTE_LCHEST){
            LoseChest(viewModel, navController)
        }
        composable(ROUTE_BICEPSTRICEPS){
            BicepsTriceps(viewModel, navController)
        }
        composable(ROUTE_FOREARMS){
            Forearms(viewModel, navController)
        }
        composable(ROUTE_SHOULDERS){
            Shoulders(viewModel, navController)
        }
        composable(ROUTE_LOWERABS){
            LowerAbs(viewModel, navController)
        }
        composable(ROUTE_UPPERABS){
            UpperAbs(viewModel, navController)
        }
        composable(ROUTE_ABSBEGINNER){
            AbsBeginner(viewModel, navController)
        }
        composable(ROUTE_ABSINTERMEDIATE){
            AbsIntermediate(viewModel, navController)
        }
        composable(ROUTE_ABSADVANCED){
            AbsAdvanced(viewModel, navController)
        }
        composable(ROUTE_ARMSADVANCED){
            ArmsAdvanced(viewModel, navController)
        }
        composable(ROUTE_ARMSBEGINNER){
            ArmsBeginner(viewModel, navController)
        }
        composable(ROUTE_ARMSINTERMEDIATE){
            ArmsIntermediate(viewModel, navController)
        }
        composable(ROUTE_CHESTBEGINNER){
            ChestBeginner(viewModel, navController)
        }
        composable(ROUTE_CHESTINTERMEDIATE){
            ChestIntermediate(viewModel, navController)
        }
        composable(ROUTE_CHESTADVANCED){
            ChestAdvanced(viewModel, navController)
        }
        composable(ROUTE_LOWERBEGINNER){
            LowerbodyBeginner(viewModel, navController)
        }
        composable(ROUTE_LOWERINTERMEDIATE){
            LowerbodyIntermediate(viewModel, navController)
        }

        composable(ROUTE_LOWERADVANCED){
            LowerbodyAdvanced(viewModel, navController)
        }
    }

}