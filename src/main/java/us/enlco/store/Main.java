package us.enlco.store;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import us.enlco.store.managers.CustomerManager;

import java.util.Date;

/**
 * Created by Sethy on 28/05/2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("./context.xml");
        CustomerManager customerService = applicationContext.getBean(CustomerManager.class);

        Date date = new Date(1933 - 03 - 15);
        customerService.addCustomer("one", "one", "one", "one", "0639317913", "one", date);
    }
}
