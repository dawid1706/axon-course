package com.ddudzik.ProductsService.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @PostMapping
    public String createProduct() {
        return "HTTP post is handled";
    }

    @GetMapping
    public String getProduct() {
        return "HTTP get is handled";
    }

    @PutMapping
    public String updateProduct() {
        return "HTTP put is handled";
    }

    @DeleteMapping
    public String deleteProduct() {
        return "HTTP delete is handled";
    }
}
