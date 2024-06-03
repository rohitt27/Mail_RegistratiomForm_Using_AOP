//package com.example.applicationLecture.service.implement;
//
//import com.example.applicationLecture.entity.Product;
//import com.example.applicationLecture.repository.ProductRepo;
//import com.example.applicationLecture.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ProductImpl implements ProductService {
//    @Autowired
//    private ProductRepo productRepo;
//
//    @Override
//    public ResponseEntity<?> saveProduct(Product product) {
//        Product pr = new Product();
//        pr.setName(product.getName());
//        pr.setPrice(product.getPrice());
//        productRepo.save(pr);
//        return ResponseEntity.ok("Product Saved");
//    }
//}
