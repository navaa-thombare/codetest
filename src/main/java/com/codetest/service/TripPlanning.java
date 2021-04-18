/**
 * @author navanaththombare
 * 18 Apr, 2021
 */

package com.codetest.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;

import com.codetest.entity.Destination;
import com.codetest.entity.FuelType;
import com.codetest.entity.VehicleType;
import com.codetest.repository.DestinationRepository;

public class TripPlanning implements ExpenseCalculator {
	
	@Autowired
	private DestinationRepository destinationRepository;
	
	@Override
	public void calcExpe(VehicleType vehicleType, FuelType fuelType, String destination,
			Integer numberOfPeopleTravelling, Boolean isAirconditioningRequired) {
		Destination dest = destinationRepository.findByCity(destination);
		System.out.println(dest);
	}

	@Override
	public BigDecimal calculateExpense(VehicleType vehicleType, FuelType fuelType, String destination,
			Integer numberOfPeopleTravelling, Boolean isAirconditioningRequired) {
		Integer maxCapacity = vehicleType.getPassengerCapacity();
		String ft = fuelType.getType();
		Destination dest = destinationRepository.findByCity(destination);
		BigDecimal  distance = new BigDecimal(dest.getDistance());
		BigDecimal standardRate = new BigDecimal(15);
		BigDecimal exp;
		if(isAirconditioningRequired) {
			standardRate = standardRate.add(new BigDecimal(2));
			if(ft.equalsIgnoreCase("Desel")) {
				standardRate = standardRate.subtract(new BigDecimal(1));
			}
		}
		if(numberOfPeopleTravelling > maxCapacity) {
			Integer extraPersons = numberOfPeopleTravelling - maxCapacity;
			standardRate = standardRate.add(new BigDecimal(extraPersons));
		}
		
		if(vehicleType.getType().equalsIgnoreCase("BUS")) {
			standardRate = standardRate.subtract(standardRate.multiply(new BigDecimal(2)).divide(new BigDecimal(100)));
		}
		
		exp = distance.multiply(standardRate);
		
		System.out.println("Vehicle Type  = "+ vehicleType.getType() + " | Fuel Type = "+ fuelType.getType()
							+ " | Capacity = " + vehicleType.getPassengerCapacity()
							+ " | AC = "+ (isAirconditioningRequired ? "Yes": "No")
							+ " | Destination : " + destination + " | Distance : " + dest.getDistance()
							+ " | Travellers : " + numberOfPeopleTravelling + " | Rate : " + standardRate 
							+ " | Total Expenses = "+exp);
		
		
		return exp;
	}

}
