package us.enlco.store.managers;

import us.enlco.store.entity.OrderDetails;
import us.enlco.store.entity.Product;

import java.util.Calendar;

/**
 * Created by Sethy on 28/05/2017.
 */
public interface OrderDetailsManager
{
    void addOrderDetails(Calendar orderDate, int quantity, Product product);

    void addOrderDetails(OrderDetails orderDetails);

    void editOrderDetails(int orderDetailsId, Calendar orderDate, int quantity);

    void deleteOrderDetails(int orderDetailsId);

    OrderDetails findOrderDetailsById(int orderDetailsId);

    void deleteAllOrderDetails();

    OrderDetails findOrderDetailsByProductId(int productId);
}
