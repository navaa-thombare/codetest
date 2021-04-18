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
public class Destination {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String city;
	private long distance;
	public Destination() {
		super();
	}
	public Destination(String city, long distance) {
		super();
		this.city = city;
		this.distance = distance;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getDistance() {
		return distance;
	}
	public void setDistance(long distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Destination [id=" + id + ", city=" + city + ", distance=" + distance + "]";
	}
	
	
}
