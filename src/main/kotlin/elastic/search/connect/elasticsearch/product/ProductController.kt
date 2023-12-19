package elastic.search.connect.elasticsearch.product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/products")
class ProductController(@Autowired private val productService: ProductService) {

    @PostMapping
    fun addProduct(@RequestBody product: Product): Product = productService.saveProduct(product)

    @GetMapping("/{id}")
    fun getProduct(@PathVariable id: String): Product? = productService.getProduct(id)

    @GetMapping
    fun getAllProducts(): Iterable<Product> = productService.getAllProducts()

    @DeleteMapping("/{id}")
    fun deleteProduct(@PathVariable id: String) = productService.deleteProduct(id)

}
