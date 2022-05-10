package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductService implements IProductService{


   private  final IProductRepository productRepository;

    public ProductService(IProductRepository iProductRepository) {
        this.productRepository = iProductRepository;
    }

    @Override
    public Product savePrduct(Product product){
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId){
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product>  findAllProducts(){
        return productRepository.findAll();
    }


}
