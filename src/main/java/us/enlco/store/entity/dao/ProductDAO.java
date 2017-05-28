package us.enlco.store.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import us.enlco.store.entity.Product;

import java.util.List;

/**
 * Created by Sethy on 28/05/2017.
 */
public interface ProductDAO extends JpaRepository<Product, Integer>
{
    @Query("select p from Product p where p.name like :name")
    List<Product> findProductByName(@Param("name") String name);

    @Query("select p from Product p where p.description like :description")
    List<Product> findProductByDescription(@Param("description") String description);

    @Query("select p from Product p where p.city like :city")
    List<Product> findProductByCity(@Param("city") String city);

    @Query("select p from Product p where p.price like :price")
    List<Product> findProductByPrice(@Param("price") double price);
}
