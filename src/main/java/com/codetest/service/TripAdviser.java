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
import com.codetest.repository.FuelTypeRepository;
import com.codetest.repository.VehicleTypeRepository;

public class TripAdviser {
	
	private ExpenseCalculator expenseCalculator;
	
	@Autowired
	private DestinationRepository destinationRepo;
	
	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;
	
	@Autowired
	private FuelTypeRepository fuelTypeRepository;

	public TripAdviser() {
		super();
	}

	public TripAdviser(ExpenseCalculator expenseCalculator) {
		super();
		this.expenseCalculator = expenseCalculator;
	}
	
	public void getTripAdvise() {
		System.out.println("TripAdviser: get expenses");
	}
	
	public void getExpenses(String vt, String ft, String dest, Integer noOfTravellers, Boolean isAC) {
		VehicleType vehicleType = vehicleTypeRepository.findByType(vt);
		FuelType fuelType = fuelTypeRepository.findByType(ft);
		BigDecimal exp = expenseCalculator.calculateExpense(vehicleType, fuelType, dest, noOfTravellers, isAC);
		System.out.println("\nThe total expenses will be : "+ exp);
	}
	
//	public void getTripExpenses(VehicleType vt, FuelType ft, String dest, Integer noOfTravellers, Boolean isAc) {
//		System.out.println(vt.toString());
//		System.out.println(ft.toString());
//		System.out.println(dest);
//		System.out.println(noOfTravellers);
//		System.out.println(isAc);
//		expenseCalculator.calcExpe(vt, ft, dest, noOfTravellers, isAc);
//	}

}
