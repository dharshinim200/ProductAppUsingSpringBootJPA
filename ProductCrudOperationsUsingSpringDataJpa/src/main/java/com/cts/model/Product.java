package com.cts.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity  // creating the table by default name (product)
@Table(name = "productinfo") //create the table by the user defined name

@Data

public class Product {


	public Product(String productName, int productPrice, String productCategory, int productQuantity) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
		this.productQuantity = productQuantity;
	}
	@Id  // declaring primary key --> mandatory 
	@Column(name = "pid") // column name by the user defined name --> optional
	@GeneratedValue   // auto generate value --> optional
	private int productId;
	private String productName;
	@Column(name = "price")
	private int productPrice;
	private String productCategory;
	@Column(name = "quantity")
	private int productQuantity;
 
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
}
