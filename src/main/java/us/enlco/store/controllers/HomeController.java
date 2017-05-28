package us.enlco.store.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import us.enlco.store.entity.dto.ProductDTO;
import us.enlco.store.managers.ProductManager;

import java.util.List;

/**
 * Created by Sethy on 28/05/2017.
 */
@Controller
public class HomeController
{
    @Autowired
    private ProductManager productManager;

    @RequestMapping(value = "/")
    public String getHome(Model model)
    {
        List<ProductDTO> allProducts = this.productManager.findAllProductsDTO();
        model.addAttribute("products", allProducts);
        return "home";
    }

    @RequestMapping(value = "/login")
    public String getLogin()
    {
        return "login";
    }
}
