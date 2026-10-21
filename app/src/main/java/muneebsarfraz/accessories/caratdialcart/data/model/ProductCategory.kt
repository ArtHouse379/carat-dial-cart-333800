package muneebsarfraz.accessories.caratdialcart.data.model

import androidx.annotation.StringRes
import muneebsarfraz.accessories.caratdialcart.R

enum class ProductCategory(@field:StringRes val titleRes: Int) {
    WATCHES(R.string.product_category_watches_title),
    RINGS(R.string.product_category_rings_title),
    NECKLACES(R.string.product_category_necklaces_title),
    EARRINGS(R.string.product_category_earrings_title),
    BRACELETS(R.string.product_category_bracelets_title),
}
