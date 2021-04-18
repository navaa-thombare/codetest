/**
 * @author navanaththombare
 * 18 Apr, 2021
 */

package com.codetest.repository;

import org.springframework.data.repository.CrudRepository;

import com.codetest.entity.Destination;

public interface DestinationRepository extends CrudRepository<Destination, Long> {
	
	public Destination findByCity(String city);

}
