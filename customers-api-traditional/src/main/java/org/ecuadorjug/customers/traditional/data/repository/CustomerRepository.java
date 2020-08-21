package org.ecuadorjug.customers.traditional.data.repository;

import org.ecuadorjug.customers.traditional.data.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByName(String name);
}
