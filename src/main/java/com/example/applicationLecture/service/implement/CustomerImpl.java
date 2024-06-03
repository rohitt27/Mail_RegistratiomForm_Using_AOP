//package com.example.applicationLecture.service.implement;
//
//import com.example.applicationLecture.entity.Customer;
//import com.example.applicationLecture.repository.CustomerRepo;
//import com.example.applicationLecture.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomerImpl implements CustomerService {
//@Autowired
//private CustomerRepo customerRepo;
//    @Override
//    public ResponseEntity<?> saveCustomer(Customer customer) {
//        Customer cu = new Customer();
//        cu.setName(customer.getName());
//        cu.setAddress(customer.getAddress());
//        customerRepo.save(cu);
//        return ResponseEntity.ok("saved Customer");
//    }
//}
