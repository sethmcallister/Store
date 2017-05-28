package us.enlco.store.bakedbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import us.enlco.store.entity.Product;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Sethy on 28/05/2017.
 */
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CartBean
{
    private Map<Product, Integer> contents = new ConcurrentHashMap<Product, Integer>();

    public Map<Product, Integer> getContents()
    {
        return contents;
    }

    public Set<Product> getProducts()
    {
        return contents.keySet();
    }

    public void addProduct(Product product, int count)
    {

        if (contents.containsKey(product))
            contents.put(product, contents.get(product) + count);
        else
            contents.put(product, count);
    }

    public void removeProduct(Product product)
    {
        contents.remove(product);
    }

    public void clearCart()
    {
        contents.clear();
    }

    public double getTotalCost()
    {
        double totalCost = 0;
        for (Product product : contents.keySet())
            totalCost += product.getPrice();
        return totalCost;
    }
}
