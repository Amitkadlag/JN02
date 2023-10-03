package com.tnsif.dayone;

public class Product {
	private int productId;
	private String productName;
	private int quantity;
	private float price;
	private float amount;
	
	
	public Product() {
		super();		
	}


	public Product(int productId, String productName, int quantity, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	void calculateAmount() {
		amount=price*quantity;
	}

   // java.lang.Object
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
				+ ", price=" + price + ", amount=" + amount + "]";
	}
	
	
}
