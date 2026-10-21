package muneebsarfraz.accessories.caratdialcart.di

import muneebsarfraz.accessories.caratdialcart.ui.viewmodel.AppViewModel
import muneebsarfraz.accessories.caratdialcart.ui.viewmodel.CartViewModel
import muneebsarfraz.accessories.caratdialcart.ui.viewmodel.CheckoutViewModel
import muneebsarfraz.accessories.caratdialcart.ui.viewmodel.OnboardingViewModel
import muneebsarfraz.accessories.caratdialcart.ui.viewmodel.OrderViewModel
import muneebsarfraz.accessories.caratdialcart.ui.viewmodel.ProductDetailsViewModel
import muneebsarfraz.accessories.caratdialcart.ui.viewmodel.ProductViewModel
import muneebsarfraz.accessories.caratdialcart.ui.viewmodel.SplashViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModule = module {
    viewModel {
        AppViewModel(
            cartRepository = get()
        )
    }

    viewModel {
        SplashViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        OnboardingViewModel(
            onboardingRepository = get()
        )
    }

    viewModel {
        ProductViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        ProductDetailsViewModel(
            productRepository = get(),
            cartRepository = get(),
        )
    }

    viewModel {
        CheckoutViewModel(
            cartRepository = get(),
            productRepository = get(),
            orderRepository = get(),
        )
    }

    viewModel {
        CartViewModel(
            cartRepository = get(),
            productRepository = get(),
        )
    }

    viewModel {
        OrderViewModel(
            orderRepository = get(),
        )
    }
}