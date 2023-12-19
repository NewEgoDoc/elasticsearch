package elastic.search.connect.elasticsearch.product
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface ProductRepository : ElasticsearchRepository<Product, String> {
}
