package muneebsarfraz.accessories.caratdialcart.data.repository

import muneebsarfraz.accessories.caratdialcart.data.model.Product
import muneebsarfraz.accessories.caratdialcart.data.model.ProductCategory
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class ProductRepository {
    private val products = listOf<Product>(
        Product(
            id = 1,
            title = "Leather Watch",
            description = "A polished analog watch with a warm leather strap and a clean, easy-to-read dial. Its understated profile works equally well with office clothing or weekend layers. A secure buckle fastening lets you adjust the fit comfortably throughout the day.",
            category = ProductCategory.WATCHES,
            price = 189.00,
            imageUrl = "https://images.pexels.com/photos/8711224/pexels-photo-8711224.jpeg",
        ),
        Product(
            id = 2,
            title = "Digital Watch",
            description = "A compact digital watch with a clear display for time, day, and date. The durable case and flexible strap make it a practical choice for everyday wear. Its retro shape adds character without feeling bulky on the wrist.",
            category = ProductCategory.WATCHES,
            price = 59.00,
            imageUrl = "https://images.pexels.com/photos/18203368/pexels-photo-18203368.jpeg",
        ),
        Product(
            id = 3,
            title = "Gold Ring",
            description = "A finely detailed gold ring designed to bring a warm glow to everyday looks. The sculpted surface catches the light while keeping a refined, balanced profile. Wear it alone as a focal point or pair it with a slim band.",
            category = ProductCategory.RINGS,
            price = 325.00,
            imageUrl = "https://images.pexels.com/photos/15871502/pexels-photo-15871502.jpeg",
        ),
        Product(
            id = 4,
            title = "Diamond Ring",
            description = "A classic gold ring set with bright diamonds in an intricate arrangement. The raised setting gives each stone space to reflect light from every angle. It is an elegant choice for a proposal, anniversary, or lasting personal keepsake.",
            category = ProductCategory.RINGS,
            price = 1195.00,
            imageUrl = "https://images.pexels.com/photos/9420323/pexels-photo-9420323.jpeg",
        ),
        Product(
            id = 5,
            title = "Pendant Necklace",
            description = "A delicate pendant necklace that adds a soft point of light at the neckline. Its fine chain and balanced drop sit neatly with both open collars and evening dresses. The versatile design makes it an easy gift and an effortless daily accessory.",
            category = ProductCategory.NECKLACES,
            price = 145.00,
            imageUrl = "https://images.pexels.com/photos/8100401/pexels-photo-8100401.jpeg",
        ),
        Product(
            id = 6,
            title = "Pearl Necklace",
            description = "A graceful pearl necklace with an even strand and a softly luminous finish. The timeless proportions frame the neckline without overwhelming an outfit. It moves naturally from daytime tailoring to formal occasions.",
            category = ProductCategory.NECKLACES,
            price = 240.00,
            imageUrl = "https://images.pexels.com/photos/922567/pexels-photo-922567.jpeg",
        ),
        Product(
            id = 7,
            title = "Gold Hoop Earrings",
            description = "A pair of polished gold hoop earrings with a rounded, contemporary profile. Their light-catching texture brings subtle movement beside the face. The comfortable size makes them suitable for daily wear as well as dressed-up evenings.",
            category = ProductCategory.EARRINGS,
            price = 110.00,
            imageUrl = "https://images.pexels.com/photos/17170737/pexels-photo-17170737.jpeg",
        ),
        Product(
            id = 8,
            title = "Geometric Earrings",
            description = "A pair of geometric gold earrings shaped with crisp lines and a modern silhouette. The angular design adds definition while remaining easy to style with other jewelry. They are light enough for all-day wear and distinctive enough for special plans.",
            category = ProductCategory.EARRINGS,
            price = 85.00,
            imageUrl = "https://images.pexels.com/photos/12145058/pexels-photo-12145058.jpeg",
        ),
        Product(
            id = 9,
            title = "Gold Bracelet",
            description = "A sleek gold bracelet with a bright finish and a neatly integrated clasp. Its slim profile rests comfortably on the wrist and layers well beside a watch. The clean design offers an elegant accent for celebrations or everyday outfits.",
            category = ProductCategory.BRACELETS,
            price = 410.00,
            imageUrl = "https://images.pexels.com/photos/12194339/pexels-photo-12194339.jpeg",
        ),
        Product(
            id = 10,
            title = "Silver Bracelet",
            description = "A sculpted silver bracelet with an intricate surface inspired by overlapping scales. The substantial metalwork creates a confident look while the curved form follows the wrist. It works as a standalone statement piece with casual or evening clothing.",
            category = ProductCategory.BRACELETS,
            price = 175.00,
            imageUrl = "https://images.pexels.com/photos/16304557/pexels-photo-16304557.jpeg",
        ),
    )

    fun observeById(id: Int): Flow<Product?> {
        val item = products.find { it.id == id }
        return flowOf(item)
    }

    fun getById(id: Int): Product? {
        return products.find { it.id == id }
    }

    fun observeAll(): Flow<List<Product>> {
        return flowOf(products)
    }
}
