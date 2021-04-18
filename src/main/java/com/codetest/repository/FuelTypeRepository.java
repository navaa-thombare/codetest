/**
 * @author navanaththombare
 * 18 Apr, 2021
 */

package com.codetest.repository;

import org.springframework.data.repository.CrudRepository;

import com.codetest.entity.FuelType;

public interface FuelTypeRepository extends CrudRepository<FuelType, Long> {
	public FuelType findByType(String type);
}
