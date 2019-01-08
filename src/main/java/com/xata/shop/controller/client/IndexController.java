package com.xata.shop.controller.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xata.shop.common.Common;
import com.xata.shop.dao.ProductCategoryDAO;

@Controller
@Transactional
public class IndexController {
	@Autowired
	private ProductCategoryDAO productCategoryDAO;
	 
	@RequestMapping(value = { "/",  "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
		
		model.addAttribute("Categorys", Common.getCategory(productCategoryDAO));
        return "client/index";
    }
  
 
}
