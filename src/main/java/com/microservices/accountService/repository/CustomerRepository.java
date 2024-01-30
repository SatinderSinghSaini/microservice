package com.microservices.accountService.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservices.accountService.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Integer>{

}
