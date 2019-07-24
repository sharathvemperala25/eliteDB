package com.HCL.Demo1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HCL.Demo1.Dto.AccountDto;
import com.HCL.Demo1.Dto.ResponseDto;
import com.HCL.Demo1.Service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@PostMapping(value="/addAccountDetails")
    public void insertAccount(AccountDto account) {
		accountService.insertAccount(account);
		
	}
	
	@GetMapping(value="/fetchAccountDetails")
    public ResponseDto fetchAccountDetails(Long accountNo) {
		return accountService.fetchAccountDetailsAccount(accountNo);
	}
	
	@GetMapping(value="/fetchAllAccountDetails")
    public ResponseDto fetchAllAccountDetails() {
		return accountService.fetchAllAccountDetails();
	}
}
