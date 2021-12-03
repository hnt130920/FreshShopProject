package com.hccs.advweb;
import java.util.ArrayList;

public class ProductList {
	private static ArrayList<Product> protList;
	
	public static ArrayList<Product> getProductList() {
		System.out.println("Product List ---->"+protList);
		return protList;
	}
	public static void setProductList(ArrayList<Product> protList) {
		protList = protList;
	}

	public static ArrayList<Product> addProduct(Product product) {
		getProductList().add(product);
		return protList;
	}


}
