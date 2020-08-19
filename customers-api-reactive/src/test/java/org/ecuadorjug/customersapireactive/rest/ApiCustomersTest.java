package org.ecuadorjug.customersapireactive.rest;

import org.ecuadorjug.customersapireactive.data.model.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@SpringBootTest//(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApiCustomersTest {

    //@LocalServerPort
    private Integer port = 8080;
    private String baseUrl = "http://localhost";
    private WebClient webClient = null;

    @BeforeEach
    void setUp() {
        baseUrl = baseUrl.concat(":").concat(port.toString());
        webClient = WebClient.builder().baseUrl(baseUrl).build();
    }

    @Test
    void getAll() {
        Flux<Customer> customers =
                webClient.get()
                        .uri("/api/customers")
                        .retrieve()
                        .bodyToFlux(Customer.class);

        customers.subscribe(customer -> {
            System.out.println("Customer subscribes: {}" + customer);
        });
        Assertions.assertNotNull(customers);
        //waiter.await(3000, 9);
    }
}