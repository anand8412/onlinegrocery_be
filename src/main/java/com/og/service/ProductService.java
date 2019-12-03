package com.og.service;

import java.util.ArrayList;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.og.Product;
import com.og.ProductForm;
import com.og.dao.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;


	public ArrayList<ProductForm> getAllProducts() {
		Iterable<Product> productIterable = productRepository.findAll();
		ArrayList<ProductForm> productFormList = convertIterableToArrayList(productIterable);
		return productFormList;
	}
	
	public ProductForm getProduct(String productId) {
		Product product = productRepository.findOne(Long.parseLong(productId));
		ProductForm form = new ProductForm();
		BeanUtils.copyProperties(product, form);
		return form;
	}
	
	public ArrayList<ProductForm> convertIterableToArrayList(Iterable<Product> productIterable) {
		ArrayList<ProductForm> productFormList = new ArrayList<ProductForm>();
		for (Product temp : productIterable) {
			ProductForm productForm = new ProductForm();
			BeanUtils.copyProperties(temp, productForm);
			productFormList.add(productForm);
		}

		return productFormList;
	}
}
