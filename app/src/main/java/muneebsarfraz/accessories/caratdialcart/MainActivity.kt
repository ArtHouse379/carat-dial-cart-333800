package muneebsarfraz.accessories.caratdialcart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import muneebsarfraz.accessories.caratdialcart.ui.composable.approot.AppRoot
import muneebsarfraz.accessories.caratdialcart.ui.theme.SZRAAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SZRAAppTheme {
                AppRoot()
            }
        }
    }
}
