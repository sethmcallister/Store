package us.enlco.store.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import us.enlco.store.entity.Order;

import java.util.Date;
import java.util.List;

/**
 * Created by Sethy on 28/05/2017.
 */
public interface OrderDAO extends JpaRepository<Order, Integer>
{
    @Query("select o from Order o where o.orderDate like :orderDate")
    List<Order> findByOrderDate(@Param("orderDate") Date orderDate);
}
