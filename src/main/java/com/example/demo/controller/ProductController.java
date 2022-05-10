package com.example.demo.controller;


import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
       return new ResponseEntity<>(productService.savePrduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("{productId}")
    public String deleteProduct(@PathVariable Long productId)
    {
        System.out.println("Product Id : " + productId);
        productService.deleteProduct(productId);
        return "Delete is successfully";
    }

    @GetMapping
    public ResponseEntity<?>  getAllProducts(){
        return ResponseEntity.ok(productService.findAllProducts());
    }

}
