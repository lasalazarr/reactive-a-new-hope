package org.ecuadorjug.customersapireactive;

import io.r2dbc.h2.H2ConnectionFactory;
import org.ecuadorjug.customersapireactive.data.model.Customer;
import org.ecuadorjug.customersapireactive.data.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.r2dbc.core.DatabaseClient;
import reactor.core.publisher.Hooks;
import reactor.test.StepVerifier;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CustomersApiReactiveApplicationTests {

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	DatabaseClient client;

	@Autowired
	H2ConnectionFactory factory;

	public void setup() {

		Hooks.onOperatorDebug();

		List<String> statements = Arrays.asList(//
				"DROP TABLE IF EXISTS customer;",
				"CREATE table customer (id INT AUTO_INCREMENT NOT NULL, name VARCHAR2, score INT NOT NULL);",
				"INSERT INTO customer VALUES (1, 'Alberto', 1000);");

		statements.forEach(it -> client.execute(it) //
				.fetch() //
				.rowsUpdated() //
				.as(StepVerifier::create) //
				.expectNextCount(1) //
				.verifyComplete());

	}

	@Test
	void contextLoads() {
	}

	@Test
	void testRepositoryReactive(){
		setup();
		insertCustomers();
		customerRepository.findByName("Alberto")
				.as(StepVerifier::create)
				.expectNextCount(1)
				.verifyComplete();
	}

	private void insertCustomers() {
		List<Customer> customers = Arrays.asList(
				new Customer(null, "Kaka", 3700),
				new Customer(null, "Messi", 3200),
				new Customer(null, "Mbappé", 2000),
				new Customer(null, "CR7", 3400),
				new Customer(null, "Lewandowski", 3000),
				new Customer(null, "Cavani", 3200)
		);

		customerRepository.saveAll(customers).subscribe();
	}
}