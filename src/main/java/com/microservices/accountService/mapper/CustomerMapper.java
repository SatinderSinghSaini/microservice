package com.microservices.accountService.mapper;

import com.microservices.accountService.dto.CustomerDto;
import com.microservices.accountService.entity.Customer;

public class CustomerMapper {

	public static CustomerDto mapToAccountsDto(Customer customer, CustomerDto customerDto) {
		customerDto.setEmail(customer.getEmail());
		customerDto.setMobileNumber(customer.getMobileNumber());
		customerDto.setName(customer.getName());
		return customerDto;
	}
	
	public static Customer mapToAccounts(CustomerDto customerDto, Customer customer) {
		customerDto.setEmail(customer.getEmail());
		customerDto.setMobileNumber(customer.getMobileNumber());
		customerDto.setName(customer.getName());
		return customer;
	}
}
