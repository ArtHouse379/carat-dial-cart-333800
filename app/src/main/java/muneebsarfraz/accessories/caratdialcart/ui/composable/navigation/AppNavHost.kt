package muneebsarfraz.accessories.caratdialcart.ui.composable.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import muneebsarfraz.accessories.caratdialcart.ui.composable.screen.cart.SZRACartScreen
import muneebsarfraz.accessories.caratdialcart.ui.composable.screen.checkout.SZRACheckoutScreen
import muneebsarfraz.accessories.caratdialcart.ui.composable.screen.home.SZRAHomeScreen
import muneebsarfraz.accessories.caratdialcart.ui.composable.screen.onboarding.SZRAOnboardingScreen
import muneebsarfraz.accessories.caratdialcart.ui.composable.screen.order.SZRAOrdersScreen
import muneebsarfraz.accessories.caratdialcart.ui.composable.screen.productdetails.SZRAProductDetailsScreen
import muneebsarfraz.accessories.caratdialcart.ui.composable.screen.settings.SZRASettingsScreen
import muneebsarfraz.accessories.caratdialcart.ui.composable.screen.splash.SZRASplashScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.Splash,
        modifier = modifier,
    ) {
        composable<NavRoute.Splash> {
            SZRASplashScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(route = NavRoute.Home) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                },
                onNavigateToOnboarding = {
                    navController.navigate(route = NavRoute.Onboarding) {
                        popUpTo(navController.graph.startDestinationId) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Onboarding> {
            SZRAOnboardingScreen(
                onNavigateToHomeScreen = {
                    navController.navigate(NavRoute.Home) {
                        popUpTo(NavRoute.Onboarding) {
                            inclusive = true
                        }
                        launchSingleTop = true
                    }
                }
            )
        }

        composable<NavRoute.Home> {
            SZRAHomeScreen(
                onNavigateToProductDetails = { id: Int ->
                    navController.navigate(
                        route = NavRoute.ProductDetails(id = id)
                    )
                }
            )
        }

        composable<NavRoute.ProductDetails> { backStackEntry ->
            val productDetails: NavRoute.ProductDetails = backStackEntry.toRoute()
            SZRAProductDetailsScreen(
                productId = productDetails.id,
            )
        }

        composable<NavRoute.Cart> {
            SZRACartScreen(
                onNavigateToCheckoutScreen = {
                    navController.navigate(NavRoute.Checkout)
                }
            )
        }

        composable<NavRoute.Checkout> {
            SZRACheckoutScreen(
                onNavigateToOrdersScreen = {
                    navController.navigate(NavRoute.Orders) {
                        popUpTo(NavRoute.Home) { inclusive = false }
                    }
                }
            )
        }

        composable<NavRoute.Orders> {
            SZRAOrdersScreen()
        }

        composable<NavRoute.Settings> {
            SZRASettingsScreen()
        }
    }
}