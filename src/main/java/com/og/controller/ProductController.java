package com.og.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.og.ProductForm;
import com.og.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	public ResponseEntity<List<ProductForm>> getAllProducts() {
		return ResponseEntity.status(HttpStatus.OK).body(productService.getAllProducts());

	}

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(value = "/getProduct", method = RequestMethod.GET)
	public ResponseEntity<ProductForm> getProduct(@RequestParam(name = "id") String productId) {

		ProductForm productForm = productService.getProduct(productId);
		return ResponseEntity.status(HttpStatus.OK).body(productForm);

	}
}
