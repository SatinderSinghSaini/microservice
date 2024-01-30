package com.microservices.accountService.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.microservices.accountService.entity.Accounts;

@Repository
public interface AccountRepository extends CrudRepository<Accounts, Long>{
	Accounts findByCustomerId(int id);
}
