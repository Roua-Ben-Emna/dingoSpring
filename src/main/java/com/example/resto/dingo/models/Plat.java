package com.example.resto.dingo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
//pour creer le table dans la bd
public class Plat {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PLAT_ID")
	private Long id;
	@Column
	private String name;
	@Column
	private float price;
	@Column
	private String description;
	public Plat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plat(String name, float price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


}
