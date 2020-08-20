package org.ecuadorjug.customers.traditional.rest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ecuadorjug.customers.traditional.data.model.Customer;
import org.ecuadorjug.customers.traditional.data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@Slf4j
@AllArgsConstructor
public class ApiCustomers {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){ return customerRepository.save(customer);}
}
