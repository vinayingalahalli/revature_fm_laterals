package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table
@ApiModel(value = "Product Model", description = "This model stores Products in DB")
public class Product {

	@Id
	@GeneratedValue
	@ApiModelProperty(name="id", value="this will generate unique ID", dataType = "int")
	private int id;
	@ApiModelProperty(name="name", value="product name here", dataType = "String",required = true,example = "TV")
	private String name;
	private double cost;
	private float ratings;
	private String manufacturerName;
	
	public Product() {
		// TODO Auto-generated constructor stub
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	
}
