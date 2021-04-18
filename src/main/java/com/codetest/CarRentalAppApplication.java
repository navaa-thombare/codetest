/**
 * @author navanaththombare
 * 18 Apr, 2021
 */

package com.codetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.codetest.entity.Destination;
import com.codetest.entity.FuelType;
import com.codetest.entity.VehicleType;
import com.codetest.repository.DestinationRepository;
import com.codetest.repository.FuelTypeRepository;
import com.codetest.repository.VehicleTypeRepository;
import com.codetest.service.TripAdviser;

@SpringBootApplication
public class CarRentalAppApplication implements CommandLineRunner{

	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;
	
	@Autowired
	private FuelTypeRepository fuelTypeRepository;
	
	@Autowired
	private DestinationRepository destinationRepository;
	
	@Autowired
	private TripAdviser tripAdviser;
	
	public static void main(String[] args) {
		SpringApplication.run(CarRentalAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("App started....");
		vehicleTypeRepository.save(new VehicleType("CAR", 5));
		vehicleTypeRepository.save(new VehicleType("SUV", 7));
		vehicleTypeRepository.save(new VehicleType("VAN", 5));
		vehicleTypeRepository.save(new VehicleType("BUS", 17));
		System.out.println("Vehicles created.");
		fuelTypeRepository.save(new FuelType("PETROL"));
		fuelTypeRepository.save(new FuelType("DESEL"));
		fuelTypeRepository.save(new FuelType("CNG"));
		fuelTypeRepository.save(new FuelType("ELECTRIC"));
		System.out.println("Fuel type created.");
		destinationRepository.save(new Destination("PUNE", 0));
		destinationRepository.save(new Destination("MUMBAI", 200));
		destinationRepository.save(new Destination("BENGLORE", 1000));
		destinationRepository.save(new Destination("DELHI", 2050));
		destinationRepository.save(new Destination("CHENNAI", 1250));
		System.out.println("Destinations created.");
		
		System.out.println("Calling get trip adiser");
		tripAdviser.getExpenses("CAR","PETROL", "MUMBAI", 5, true);
//		tripAdviser.getTripAdvise();
//		tripAdviser.getTripExpenses(new VehicleType("CAR", 5), new FuelType("PETROL"), "MUMBAI", 4, false);
//		
		
	}

}
