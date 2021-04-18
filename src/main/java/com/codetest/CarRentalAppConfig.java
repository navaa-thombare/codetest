/**
 * @author navanaththombare
 * 18 Apr, 2021
 */

package com.codetest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.codetest.service.TripAdviser;
import com.codetest.service.TripPlanning;

@Configuration
@ComponentScan("com.codetest")
public class CarRentalAppConfig {
	
	@Bean
	public TripPlanning getTripPlanning() {
		return new TripPlanning();
	}
	
	@Bean
	public TripAdviser getTripAdviser() {
		return new TripAdviser(getTripPlanning());
	}
}
