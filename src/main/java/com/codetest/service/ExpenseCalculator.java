/**
 * @author navanaththombare
 * 18 Apr, 2021
 */

package com.codetest.service;

import java.math.BigDecimal;

import com.codetest.entity.FuelType;
import com.codetest.entity.VehicleType;

public interface ExpenseCalculator {
	
	BigDecimal calculateExpense(VehicleType vehicleType,FuelType fuelType,String destination,Integer numberOfPeopleTravelling,Boolean isAirconditioningRequired);
	void calcExpe(VehicleType vehicleType,FuelType fuelType,String destination,Integer numberOfPeopleTravelling,Boolean isAirconditioningRequired);

}
