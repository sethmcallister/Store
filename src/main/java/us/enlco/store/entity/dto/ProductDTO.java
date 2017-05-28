package us.enlco.store.entity.dto;

/**
 * Created by Sethy on 28/05/2017.
 */
public class ProductDTO
{
    private int productId;
    private String name;
    private String description;
    private String city;
    private double price;
    private String categoryName;
    private String imagePath;

    public ProductDTO()
    {

    }

    public ProductDTO(int productId, String name, String description, String city, double price, String categoryName)
    {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.city = city;
        this.price = price;
        this.categoryName = categoryName;
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

    public String getCategoryName()
    {
        return categoryName;
    }

    public void setCategoryName(String categoryName)
    {
        this.categoryName = categoryName;
    }

    public String getImagePath()
    {
        return imagePath;
    }

    public void setImagePath(String imagePath)
    {
        this.imagePath = imagePath;
    }

}
