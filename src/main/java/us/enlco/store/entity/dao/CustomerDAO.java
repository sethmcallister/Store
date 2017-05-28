package us.enlco.store.entity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import us.enlco.store.entity.Customer;

import java.util.List;

/**
 * Created by Sethy on 28/05/2017.
 */
public interface CustomerDAO extends JpaRepository<Customer, Integer>
{
    @Query("select c from Customer c where c.firstName like :firstName")
    List<Customer> findAllByFirstName(@Param("firstName") String firstName);

    @Query("select c from Customer c where c.lastName like :lastName")
    List<Customer> findByLastName(@Param("lastName") String lastName);

    @Query("select c from Customer c where c.login like :login")
    Customer findByLogin(@Param("login") String login);

    @Query("select c from Customer c where c.phone like :phone")
    Customer findByPhone(@Param("phone") String phone);

    @Query("select c from Customer c where c.email like :email")
    Customer findByEmail(@Param("email") String email);
}
