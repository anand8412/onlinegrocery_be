package com.og.dao;

import org.springframework.data.repository.CrudRepository;

import com.og.Product;



public interface ProductRepository extends CrudRepository<Product, Long>  {


}
