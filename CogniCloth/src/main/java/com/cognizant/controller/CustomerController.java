package com.cognizant.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.dao.CustomerDao;
import com.cognizant.entityclasses.Customer;

@Controller
public class CustomerController 
{
	@Autowired
    private CustomerDao custdao;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	//get categories
	@RequestMapping({"/customer"})
	public  Customer getcustomerdetails(int id)
	{	
		return custdao.getCustomerbyId(id);
	}
}