package com.nagarro.advanceJava5API.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Author {
	
	@Id
	private String name;
	Author(){}
	public Author(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + "]";
	}
	
}
