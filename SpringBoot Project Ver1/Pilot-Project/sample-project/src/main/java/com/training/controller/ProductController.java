package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.training.entity.ProductEntity;
import com.training.service.IProductService;

@Controller
@RequestMapping(value = { "/product" })
public class ProductController {
	
	@Autowired
	IProductService productService;
	
	@GetMapping
	public String initPage(Model model) {
		model.addAttribute("productList", productService.getAll());
		return "product-index";
	}
	
//	@GetMapping(value = {"/delete"})
//	public String delete(@RequestParam(name = "id") Long brandId) {
//		productService.delete(brandId);
//		return "redirect:/brand";
//	}
}
