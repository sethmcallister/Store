package us.enlco.store.managers;

import us.enlco.store.entity.Customer;

import java.util.Date;
import java.util.List;

/**
 * Created by Sethy on 28/05/2017.
 */
public interface CustomerManager
{
    void addCustomer(String login, String password, String firstName, String lastName, String phone, String email, Date dateOfBirth);

    void editCustomer(int customerId, String login, String password, String firstName, String lastName, String phone, String email, Date dateOfBirth);

    void deleteCustomer(int customerId);

    Customer findCustomerById(int customerId);

    List<Customer> findAllByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);

    Customer findByLogin(String login);

    Customer findByPhone(String phone);

    Customer findByEmail(String email);

    List<Customer> findAllCustomers();

    String findCustomerNameById(int customerId);
}
