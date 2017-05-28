package us.enlco.store.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Sethy on 28/05/2017.
 */
@Entity
@Table(name = "customers")
public class Customer
{
    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerId;

    @Column(name = "customer_login", unique = true, nullable = false)
    private String login;

    @Column(name = "customer_password", nullable = false)
    private String password;

    @Column(name = "customer_firstName")
    private String firstName;

    @Column(name = "customer_lastName")
    private String lastName;

    @Column(name = "customer_phone", unique = true, nullable = false)
    private String phone;

    @Column(name = "customer_email", unique = true, nullable = false)
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "customer_dateOfBirth", nullable = false)
    private Date dateOfBirth;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "customer")
    private List<Order> orders;

    public Customer()
    {

    }

    public Customer(String login, String password, String firstName, String lastName, String phone, String email,
                    Date dateOfBirth)
    {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public int getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(int customerId)
    {
        this.customerId = customerId;
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public List<Order> getOrders()
    {
        return orders;
    }

    public void setOrders(List<Order> orders)
    {
        this.orders = orders;
    }
}
