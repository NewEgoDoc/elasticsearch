package elastic.search.connect.elasticsearch.product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductService(@Autowired private val productRepository: ProductRepository) {

    fun saveProduct(product: Product): Product = productRepository.save(product)

    fun getProduct(id: String): Product? = productRepository.findById(id).orElse(null)

    fun getAllProducts(): Iterable<Product> = productRepository.findAll()

    fun deleteProduct(id: String) = productRepository.deleteById(id)

    fun updateProduct(id: String, updatedProduct: Product): Product {
        val product = productRepository.findById(id).orElse(null)
            ?: throw RuntimeException("Product not found with id: $id")

        product.name = updatedProduct.name
        product.price = updatedProduct.price

        return productRepository.save(product)
    }
}
