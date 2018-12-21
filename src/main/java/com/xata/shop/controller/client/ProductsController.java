package com.xata.shop.controller.client;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@Transactional
public class ProductsController {
	@RequestMapping(value = { "/products.html", "/{a}/{id}" }, method = RequestMethod.GET)
    public String index(Model model) {
        return "/client/products";
    }
  
 
}
