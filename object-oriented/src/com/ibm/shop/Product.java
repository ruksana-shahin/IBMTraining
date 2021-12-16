package com.ibm.shop;

public class Product {
	private String name;
	private int stock;
	private double price;
	
	public Product(String name,int stock, double price) {
		super();
		this.name=name;
		this.price=price;
		this.stock=stock;
	} 
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock=stock;
	}
		public void print() {
		System.out.println("Product:"+ name+"\tRs."+price+"\tLeft:"+stock);
	}
		public static void main(String[] args) {
			Product p1=new Product("ruksana",12345, 788);
			p1.print();
				
			}
		}
