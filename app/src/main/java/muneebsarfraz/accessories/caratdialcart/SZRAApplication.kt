package muneebsarfraz.accessories.caratdialcart

import android.app.Application
import muneebsarfraz.accessories.caratdialcart.di.dataModule
import muneebsarfraz.accessories.caratdialcart.di.dispatcherModule
import muneebsarfraz.accessories.caratdialcart.di.viewModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class SZRAApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val appModules = dataModule + viewModule + dispatcherModule

        startKoin {
            androidLogger()
            androidContext(this@SZRAApplication)
            modules(appModules)
        }
    }
}
