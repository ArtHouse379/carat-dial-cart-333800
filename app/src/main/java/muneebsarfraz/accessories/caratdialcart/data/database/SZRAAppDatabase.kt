package muneebsarfraz.accessories.caratdialcart.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import muneebsarfraz.accessories.caratdialcart.data.database.dao.CartItemDao
import muneebsarfraz.accessories.caratdialcart.data.database.dao.OrderDao
import muneebsarfraz.accessories.caratdialcart.data.database.converter.Converters
import muneebsarfraz.accessories.caratdialcart.data.entity.CartItemEntity
import muneebsarfraz.accessories.caratdialcart.data.entity.OrderEntity

@Database(
    entities = [CartItemEntity::class, OrderEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class SZRAAppDatabase : RoomDatabase() {

    abstract fun cartItemDao(): CartItemDao

    abstract fun orderDao(): OrderDao
}