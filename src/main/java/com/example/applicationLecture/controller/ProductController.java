//package com.example.applicationLecture.controller;
//
//import com.example.applicationLecture.entity.Product;
//import com.example.applicationLecture.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class ProductController {
//    @Autowired
//    private ProductService productService;
//@PostMapping("/saveProduct")
//    public ResponseEntity<?> save(@RequestBody Product product){
//        productService.saveProduct(product);
//        return ResponseEntity.ok("saved");
//    }
//}
