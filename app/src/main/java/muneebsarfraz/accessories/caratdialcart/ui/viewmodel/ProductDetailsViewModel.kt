package muneebsarfraz.accessories.caratdialcart.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import muneebsarfraz.accessories.caratdialcart.data.model.Product
import muneebsarfraz.accessories.caratdialcart.data.repository.CartRepository
import muneebsarfraz.accessories.caratdialcart.data.repository.ProductRepository
import muneebsarfraz.accessories.caratdialcart.ui.state.DataUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class ProductDetailsViewModel(
    private val productRepository: ProductRepository,
    private val cartRepository: CartRepository,
) : ViewModel() {
    private val _productDetailState =
        MutableStateFlow<DataUiState<Product>>(DataUiState.Initial)
    val productDetailsState: StateFlow<DataUiState<Product>>
        get() = _productDetailState.asStateFlow()

    fun observeProductDetails(productId: Int) {
        viewModelScope.launch {
            productRepository.observeById(productId).collect { product ->
                _productDetailState.update {
                    DataUiState.from(product)
                }
            }
        }
    }

    fun addProductToCart() {
        viewModelScope.launch {
            val state = _productDetailState.value
            if (state is DataUiState.Populated) {
                cartRepository.incrementProductQuantityOrAdd(state.data)
            }
        }
    }
}