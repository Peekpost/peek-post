package pcom.peekpost.postbox.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="user")
public class User {
	
	@NotNull
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigDecimal userId;
	
	private String name;
	
	@NotNull
	private String email;
	
	@NotNull
	private String phone;
	
	private String address;
	
	public BigDecimal getUserId() {
		return userId;
	}
	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public User() { } 
	
	public User(BigDecimal userId){
		this.userId = userId;
	}
	
	public User(String phone, String name) {
		this.phone = phone;
		this.name = name;
	}
	
}
