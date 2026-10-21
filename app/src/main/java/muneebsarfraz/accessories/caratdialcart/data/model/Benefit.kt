package muneebsarfraz.accessories.caratdialcart.data.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AutoAwesome
import androidx.compose.material.icons.filled.Diamond
import androidx.compose.material.icons.filled.Verified
import androidx.compose.ui.graphics.vector.ImageVector

data class Benefit(
    val icon: ImageVector,
    val text: String,
)

val productBenefits = listOf<Benefit>(
    Benefit(
        icon = Icons.Filled.Diamond,
        text = "Fine materials",
    ),
    Benefit(
        icon = Icons.Filled.Verified,
        text = "Two-year warranty",
    ),
    Benefit(
        icon = Icons.Filled.AutoAwesome,
        text = "Everyday finishing touch",
    ),
)
