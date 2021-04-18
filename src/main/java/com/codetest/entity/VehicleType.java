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
public class VehicleType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String type;
	private int passengerCapacity;
	public VehicleType() {
		super();
	}
	public VehicleType(String type, int passengerCapacity) {
		super();
		this.type = type;
		this.passengerCapacity = passengerCapacity;
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
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	@Override
	public String toString() {
		return "VehicleType [id=" + id + ", type=" + type + ", passengerCapacity=" + passengerCapacity + "]";
	}
	
	

}
