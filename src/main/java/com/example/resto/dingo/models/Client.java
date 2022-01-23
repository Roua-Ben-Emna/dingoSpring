package com.example.resto.dingo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Client_ID")
	private Long id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private Integer tel;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String firstName, String lastName, String email, String password,Integer tel) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.tel = tel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getTel() {
		return tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	
	
	

}
