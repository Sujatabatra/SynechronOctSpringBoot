package com.sujata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.Item;
import com.sujata.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/")
	public ModelAndView getMainPage(){
		return new ModelAndView("index");
	}
	
	@RequestMapping("/searchByName")
	public ModelAndView productByNameController(){
		return new ModelAndView("product");
	}
	
	@RequestMapping("/searchProductByName")
	public ModelAndView searchProduct(@RequestParam("name")String na){
		Item item=productService.getProductByName(na);
		ModelAndView mv=new ModelAndView();
		mv.addObject("product", item);
		mv.setViewName("show");
		return mv;
	}
}
