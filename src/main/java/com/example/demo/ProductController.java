package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	private static final Logger logger = LogManager.getLogger(DemoApplication.class);
	private static Map<String, Product> productRepo = new HashMap<>();
	static {
		Product honey = new Product();
		honey.setId("1");
		honey.setName("Honey");
		productRepo.put(honey.getId(), honey);

		Product almond = new Product();
		almond.setId("2");
		almond.setName("Almond");
		productRepo.put(almond.getId(), almond);
	}
	@RequestMapping(value = "/products")
	public ResponseEntity<Object> getProducts() {
		logger.info("Products method");
		return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
	}
	@RequestMapping(value = "/products/{id}")
	public ResponseEntity<Object> getProduct(@PathVariable("id") String id) {
		logger.info("Product methoda");
		System.out.println(id);
		productRepo.get(id);
		return new ResponseEntity<>(productRepo.values(), HttpStatus.OK);
	}

}
