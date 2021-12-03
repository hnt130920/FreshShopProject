package com.hccs.advweb;

import java.util.ArrayList;

public interface ProductService {

	
	public void addProduct(Product Product);
	
	public Product getProduct(int Id);
	
	public ArrayList<Product> getProductList();
	
	
}
