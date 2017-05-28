package us.enlco.store.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Sethy on 28/05/2017.
 */
@Entity
@Table(name = "products")
public class Product
{
    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    @Column(name = "product_name", nullable = false)
    private String name;

    @Column(name = "product_description", nullable = false)
    private String description;

    @Column(name = "product_city", nullable = false)
    private String city;

    @Column(name = "product_price", nullable = false)
    private double price;

    @Lob
    private byte[] imagePath;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
    private List<OrderDetails> orderDetails;

    public Product()
    {

    }

    public Product(String name, String description, String city, double price)
    {
        this.name = name;
        this.description = description;
        this.city = city;
        this.price = price;
//		this.category = category;
    }

    public int getProductId()
    {
        return productId;
    }

    public void setProductId(int productId)
    {
        this.productId = productId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public byte[] getImagePath()
    {
        return imagePath;
    }

    public void setImagePath(byte[] imagePath)
    {
        this.imagePath = imagePath;
    }

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }

    public List<OrderDetails> getOrderDetails()
    {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetails> orderDetails)
    {
        this.orderDetails = orderDetails;
    }
}
