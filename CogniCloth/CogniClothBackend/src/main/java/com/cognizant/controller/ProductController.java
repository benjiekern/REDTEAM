package com.cognizant.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController 
{
	 //   private ProductDao productdao;
		//home
		/*@RequestMapping("/")
		public String home()
		{
			return "index";
		}*/
		
		//get product list
	 /*   @GetMapping({"/productlist"})
		public  List<Product> getproductlist()
		{
			return productdao.productlist();
		}
		
		//get product by id
	    @GetMapping({"/getProduct/{id}"})
		public Product getProduct(@PathVariable int id)
		{
			return productdao.getProduct(id);
			
		}
		
		// delete product by id
	    @DeleteMapping({"/deleteProduct/{id}"})
		public void deleteProduct(@PathVariable int id)
		{
			productdao.deleteProduct(id);
		}
		
		*/
}
		