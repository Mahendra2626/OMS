package com.orders.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrdersService {


	@Autowired
	OrdersRepository repo;

	//Find all orders
	Iterable<Orders> getAllOrders(){
		return repo.findAll();
	}

	//Find orders By Id

	Optional<Orders> getOrdersById(Integer id){
		if(repo.findById(id).isEmpty())
			throw new OrdersNotFoundException();
		return repo.findById(id);
	}
	// Find orders By Name
	List<Orders> findByName(String name){
		
		//if(name)
			//throw new OrdersNotFoundException("The Order your looking for Doesn't Exist");
		return repo.findByName(name);
	}


	//Find orders by Brand Name

	List<Orders> findByBrandName(String brandName){
		return repo.findByBrand(brandName);
	}

	//Save the new Order

	void addNewOrder(Orders theOrder) {
		repo.save(theOrder);
	}
	//Update the existing Order

	public void updateOrders(Orders theOrder) {
		repo.save(theOrder);
	}
	
	//Delete the order By Id
	public void deleteOrder(Integer id) {
		repo.deleteById(id);
	}



}
