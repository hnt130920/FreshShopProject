package com.hccs.advweb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCT")
public class Product implements Serializable {
	@Id
	@Column(name ="ID")
	private int id;
	@Column(name ="PRONAME")
	private String name;
	@Column (name ="PROIMAGE")
	private String image;
	@Column (name ="PROCOST")
	private double cost;
	@Column (name = "PROSTATUS")
	private String status;
	
	public Product(int id, String name, String image, double cost, String status) {
		this.id = id;
		this.name = name;
		this.image = image;
		this.cost = cost;
		this.status = status;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", image=" + image + ", cost=" + cost + ", status=" + status
				+ "]";
	}


	public Product() {
		// TODO Auto-generated constructor stub
	}

}
