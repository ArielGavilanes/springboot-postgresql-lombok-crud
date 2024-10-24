package com.insti.primer_crud.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insti.primer_crud.products.repository.ProductRepository;
import com.insti.primer_crud.users.model.User;
import com.insti.primer_crud.products.model.Product;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product createProduct(Product newProduct) {
        return productRepository.save(newProduct);
    }

    public Product updateProduct(Long id, Product productDetails) {
        Product product = productRepository.findById(id).orElse(null);
        product.setNombre(productDetails.getNombre());
        product.setPrecio(productDetails.getPrecio());

        return productRepository.save(product);
    }

    public Product partiallyUpdateProduct(long id, Product productDetails) {
        Product product = productRepository.findById(id).orElse(null);

        if (productDetails.getNombre() != null) {
            product.setNombre(productDetails.getNombre());
        }

        if (productDetails.getPrecio() != null) {
            product.setPrecio(productDetails.getPrecio());
        }

        return productRepository.save(product);
    }

    public void deleteProduct(long id) {
        Product product = productRepository.findById(id).orElse(null);
        productRepository.delete(product);
    }
}
