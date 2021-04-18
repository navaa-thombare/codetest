/**
 * @author navanaththombare
 * 18 Apr, 2021
 */

package com.codetest.repository;

import org.springframework.data.repository.CrudRepository;

import com.codetest.entity.VehicleType;

public interface VehicleTypeRepository extends CrudRepository<VehicleType, Long>{
	
	public VehicleType findByType(String type);

}
