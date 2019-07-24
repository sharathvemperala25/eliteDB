package com.HCL.Demo1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.HCL.Demo1.Dto.AccountDto;
import com.HCL.Demo1.Service.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@PostMapping(value="/addAccountDetails")
    public void insertAccount(AccountDto account) {
		accountService.insertAccount(account);
		
	}
}
