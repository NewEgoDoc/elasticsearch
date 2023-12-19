package elastic.search.connect.elasticsearch.product
import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document

@Document(indexName = "product")
data class Product(
    @Id
    val id: String? = null,
    val name: String,
    val price: Double
)
