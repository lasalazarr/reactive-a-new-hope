package org.ecuadorjug.customersapireactive.rest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ecuadorjug.customersapireactive.data.model.Customer;
import org.ecuadorjug.customersapireactive.data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/customers")
@Slf4j
@AllArgsConstructor
public class ApiCustomers {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping
    public Flux<Customer> getAll(){
        return customerRepository.findAll();
    }
}