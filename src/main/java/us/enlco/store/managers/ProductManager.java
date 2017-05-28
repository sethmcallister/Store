package us.enlco.store.managers;

import org.springframework.web.multipart.MultipartFile;
import us.enlco.store.entity.Product;
import us.enlco.store.entity.dto.ProductDTO;

import java.util.List;

/**
 * Created by Sethy on 28/05/2017.
 */
public interface ProductManager
{
    void addProduct(String name, String description, String city, double price, MultipartFile file, String category);

    void saveProduct(Product product);

    void editProduct(int productId, String name, String description, double price, MultipartFile file);

    void deleteProduct(int productId);

    Product findProductById(int productId);

    List<Product> findProductByCity(String city);

    List<Product> findAllProducts();

    List<ProductDTO> findAllProductsDTO();
}
