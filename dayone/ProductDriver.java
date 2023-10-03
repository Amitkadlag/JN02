package com.tnsif.dayone;

public class ProductDriver {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.setProductId(100);
		p1.setProductName("Notebook");
		p1.setQuantity(10);
		p1.setPrice(120);
		p1.setAmount(p1.getPrice()*p1.getQuantity());
		
		System.out.println(p1);
		
		Product p2=new Product(200,"Pen",20,45);
		p2.calculateAmount();
		System.out.println(p2);

	}

}
