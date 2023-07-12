package com.amazonapp.metadata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "User")
public class MetaDataUser {
	
	@Id	
	@GeneratedValue	
	private long id;
	
	private String name;
	private String email;
	private String uniqueId;
	public MetaDataUser(long id, String name, String email, String uniqueId) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.uniqueId = uniqueId;
	}
	public MetaDataUser() {
		
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	
}
	