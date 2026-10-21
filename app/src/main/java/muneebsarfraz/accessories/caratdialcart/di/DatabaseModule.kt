package muneebsarfraz.accessories.caratdialcart.di

import androidx.room.Room
import muneebsarfraz.accessories.caratdialcart.data.database.SZRAAppDatabase
import org.koin.dsl.module

private const val DB_NAME = "szra_db"

val databaseModule = module {
    single {
        Room.databaseBuilder(
            context = get(),
            klass = SZRAAppDatabase::class.java,
            name = DB_NAME
        ).build()
    }

    single { get<SZRAAppDatabase>().cartItemDao() }

    single { get<SZRAAppDatabase>().orderDao() }
}