package com.arindam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arindam.model.Order;
import com.arindam.service.OrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:3000/")
public class OrderController {
	@Autowired
private OrderService oservice;
	@PostMapping("/add")
	public ResponseEntity<String> addData(@RequestBody Order o)
	{
		String msg="ORDER SUCESSFULL";
		oservice.addData(o);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/billing")
	public ResponseEntity<List> billing()
	{
		List bill=oservice.billing();
		return new ResponseEntity<List>(bill,HttpStatus.OK);
	}
}
