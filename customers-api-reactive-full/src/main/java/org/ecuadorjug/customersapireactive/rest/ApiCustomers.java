package org.ecuadorjug.customersapireactive.rest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.ecuadorjug.customersapireactive.data.model.Customer;
import org.ecuadorjug.customersapireactive.data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

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

    @PostMapping
    public Mono<Customer> save(@RequestBody Customer customer){ return customerRepository.save(customer);}

    @GetMapping("/slow")
    public Flux<Customer> getAllBackpressure(){
        return customerRepository.findAll().onBackpressureBuffer(10);
    }

}