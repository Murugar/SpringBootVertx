package com.iqmsoft.boot.vertx.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.iqmsoft.boot.vertx.jpa.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}