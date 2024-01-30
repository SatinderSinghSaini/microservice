package com.microservices.accountService.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.accountService.constants.Constants;
import com.microservices.accountService.entity.Customer;

@RestController
@RequestMapping(path="/api",produces=MediaType.APPLICATION_JSON_VALUE)
public class AccountController {

//	@Autowired
//	private AccountRepository accountRepository;
	
	@PostMapping(value="/create")
	public ResponseEntity<ResponseDto> getAccountDetails(@RequestBody Customer customer) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(new ResponseDto(Constants.STATUS_201,Constants.MESSAGE_201));
	}
}
