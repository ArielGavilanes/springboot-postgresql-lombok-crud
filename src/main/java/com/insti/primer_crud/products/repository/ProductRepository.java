package com.insti.primer_crud.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insti.primer_crud.products.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
