package us.enlco.store.managers;

import us.enlco.store.entity.Customer;
import us.enlco.store.entity.Product;

import javax.persistence.criteria.Order;
import java.util.List;
import java.util.Map;

/**
 * Created by Sethy on 28/05/2017.
 */
public interface OrderManager
{
    void addOrder(Order order);

    void addOrder(Map<Product, Integer> cartContents, Customer purchasedBy);

    void deleteOrder(int orderId);

    Order findOrderById(int orderId);

    List<Order> findAllOrders();
}
