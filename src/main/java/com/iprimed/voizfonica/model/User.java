package com.iprimed.voizfonica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userId")
	private int id;
	@Column(name="firstName")
	private String firstName;
	@Column(name="lastName")
	private String lastName;
	@Column(name="gender")
	private String gender;
	@Column(name="email")
	private String email;
	@Column(name="mobileNumber")
	private long mobileNumber;
	 @Column(name="password")
	private String password;
	@Column(name="type")
	private String type;
//	private int otp;
	
	public User() {
		
	}
	
	public User(int id, String firstName, String lastName, String gender, String email, long mobileNumber
			 , String password,String type, int otp) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.mobileNumber = mobileNumber;
		 
		this.password = password;
		this.type=type;
	}
	
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	 
	 
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

//	public int getOtp() {
//		return otp;
//	}
//
//	public void setOtp(int otp) {
//		this.otp = otp;
//	}
//	
	
	
	
	

}
