package com.orders.application;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends CrudRepository<Orders, Integer> {
	  
	List<Orders> findByName(String name);
	List<Orders> findByBrand(String brandName);

}
