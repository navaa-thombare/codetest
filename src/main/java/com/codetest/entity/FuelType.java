/**
 * @author navanaththombare
 * 18 Apr, 2021
 */

package com.codetest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FuelType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String type;

	public FuelType() {
		super();
	}

	public FuelType(String type) {
		super();
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "FuelType [id=" + id + ", type=" + type + "]";
	}
	
	
	
	
}
