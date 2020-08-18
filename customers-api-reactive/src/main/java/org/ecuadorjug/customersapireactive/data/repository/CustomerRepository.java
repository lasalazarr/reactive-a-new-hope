package org.ecuadorjug.customersapireactive.data.repository;

import org.ecuadorjug.customersapireactive.data.model.Customer;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CustomerRepository extends ReactiveCrudRepository<Customer, Integer> {
    @Query("SELECT * FROM customer WHERE name = :name")
    Flux<Customer> findByName(String name);
}
