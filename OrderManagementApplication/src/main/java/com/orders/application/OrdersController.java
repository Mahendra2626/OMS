package com.orders.application;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/OMS")
public class OrdersController {
	
	@Autowired
	OrdersService service;
	
	
	//Get all Orders
	
	@GetMapping("/orders")
	Iterable<Orders> getAllOrders(){
		return service.getAllOrders();
	}
	
	//Get Orders By Id
	@GetMapping("/orders/{id}")
	Optional<Orders> getOrdersById(@PathVariable Integer id){
		return service.getOrdersById(id);
		
	}
	
	//Get Orders By Name
	
	@GetMapping("/orders/name/{name}")
	List<Orders> findOrdersByName(@PathVariable String name){
		return service.findByName(name);
	}
	
	// Get Orders By Brand Name
	@GetMapping("/orders/brandname/{brandname}")
	List<Orders> findOrdersByBrandName(@PathVariable String brandName){
		return service.findByName(brandName);
	}
	
	
	
	//Post or Add new Order
	
	@PostMapping("/orders")
	void addNewOrder(@RequestBody Orders order) {
		 service.addNewOrder(order);
	}
	
	
	//Update the Order
	
	@PutMapping("/orders/{id}")
	void updateOrder(@PathVariable Integer id,@RequestBody Orders order) {
		service.updateOrders(order);
	}
	
	//Delete the Order
	
	@DeleteMapping("/orders/{id}")
	void deleteOrder(@PathVariable Integer id) {
		service.deleteOrder(id);
	}

}