package us.enlco.store.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Sethy on 28/05/2017.
 */
@Entity
@Table(name = "orders")
public class Order
{
    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "order_date", nullable = false)
    private Calendar orderDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
    private List<OrderDetails> orderDetails;

    public Order()
    {

    }

    public Order(Calendar orderDate, Customer customer)
    {
        this.orderDate = orderDate;
        this.customer = customer;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public void setOrderId(int orderId)
    {
        this.orderId = orderId;
    }

    public Calendar getOrderDate()
    {
        return this.orderDate;
    }

    public void setOrderDate(Calendar orderDate)
    {
        this.orderDate = orderDate;
    }

    public Customer getCustomer()
    {
        return this.customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public List<OrderDetails> getOrderDetails()
    {
        return this.orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails)
    {
        this.orderDetails = orderDetails;
    }
}
