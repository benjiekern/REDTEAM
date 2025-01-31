package com.cognizant.entityclasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")

public class OrderDetails {
	
	@Id
	@OneToMany
	@JoinColumn(name="orderid")
	private int orderID;
	
	@Column(name="productid")
	private int productID;
	
	@Column(name="quantity")
	private int quantity;
	
	public OrderDetails() {
		super();
	}
	public OrderDetails(int orderID, int productID, int quantity) {
		super();
		this.orderID = orderID;
		this.productID = productID;
		this.quantity = quantity;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
