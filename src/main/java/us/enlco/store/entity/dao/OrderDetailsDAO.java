package us.enlco.store.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import us.enlco.store.entity.OrderDetails;

/**
 * Created by Sethy on 28/05/2017.
 */
public interface OrderDetailsDAO extends JpaRepository<OrderDetails, Integer>
{
    @Query("select o from OrderDetails o where o.product.productId like :productId")
    OrderDetails findOrderDetailsByProductId(@Param("productId") int productId);

    @Query("select o from OrderDetails o where o.order.orderId like :orderId")
    OrderDetails findOrderDetailsByOrderId(@Param("orderId") int orderId);

    @Query("select o from OrderDetails o where o.orderDetailsId like :orderDetailsId")
    OrderDetails findOrderDetailsById(@Param("orderDetailsId") int orderDetailsId);
}
