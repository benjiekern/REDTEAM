package com.cognizant.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.cognizant.dao.CategoryDao;
import com.cognizant.entityclasses.Category;

@RestController
@RequestMapping("/cart")
public class CategoryController
{

@Autowired	
private CategoryDao catdao;

	//home
	/*@RequestMapping("/")
	public String home()
	{
		return "index";
	}*/
	
	//get categories
	@GetMapping({"/categorylist"})
	public  List<Category> getcategorylist()
	{
		return catdao.categorylist();
	}
	
	// get category from category list
	@GetMapping({"/categoryDisplay/{categotytitle}"})
	public Category categoryDisplay(@PathVariable int categorytitle)
	{
		return catdao.getName(categorytitle);
	}

	// update category from list
	@RequestMapping({"/categoryUpdate"})
	public void categoryUpdate(@RequestBody Category category)
	{
		catdao.updateCategory(category);
	}
	
}
