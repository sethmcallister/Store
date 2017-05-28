package us.enlco.store.entity;

import javax.persistence.*;
import java.util.Calendar;

/**
 * Created by Sethy on 28/05/2017.
 */
@Entity
@Table(name = "orderdetails")
public class OrderDetails
{
    @Id
    @Column(name = "orderDetails_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderDetailsId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "orderDetails_date", nullable = false)
    private Calendar orderDate;

    @Column(name = "orderDetails_quantity", nullable = false)
    private int quantity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private Product product;

    public OrderDetails()
    {

    }

    public OrderDetails(Calendar orderDate, int quantity, Product product)
    {
        this.orderDate = orderDate;
        this.quantity = quantity;
        this.product = product;
    }

    public int getOrderDetailsId()
    {
        return orderDetailsId;
    }

    public void setOrderDetailsId(int orderDetailsId)
    {
        this.orderDetailsId = orderDetailsId;
    }

    public Calendar getOrderDate()
    {
        return orderDate;
    }

    public void setOrderDate(Calendar orderDate)
    {
        this.orderDate = orderDate;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public Order getOrder()
    {
        return order;
    }

    public void setOrder(Order order)
    {
        this.order = order;
    }

    public Product getProduct()
    {
        return product;
    }

    public void setProduct(Product product)
    {
        this.product = product;
    }
}
