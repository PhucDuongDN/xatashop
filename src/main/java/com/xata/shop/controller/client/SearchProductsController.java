package com.xata.shop.controller.client;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@Transactional
public class SearchProductsController {
	@RequestMapping(value = { "/searchProducts" }, method = RequestMethod.POST)
	public String searchProducts(Model model, Principal principal, HttpServletRequest request, HttpServletResponse response) {

		return "redirect:/search/q=" + request.getParameter("srchFld");
	}
	@RequestMapping(value = { "/search/q={srchFld}" }, method = RequestMethod.GET)
	public String search(@PathVariable("srchFld") String srchFld, Model model) {

		return "client/products";
	}
}
