package com.example.spring_ec2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController
public class ProductController {
    @GetMapping("/products")
    public List<Product> getProducts() {
        // Creating a simple list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", "A high-performance laptop", 1200.00));
        products.add(new Product(2, "Smartphone", "A latest model smartphone", 800.00));
        products.add(new Product(3, "Headphones", "Noise-cancelling headphones", 150.00));
        return products;
    }
}
