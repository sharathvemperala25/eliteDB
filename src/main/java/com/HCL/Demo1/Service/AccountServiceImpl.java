package com.HCL.Demo1.Service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HCL.Demo1.Dto.AccountDto;
import com.HCL.Demo1.Dto.ResponseDto;
import com.HCL.Demo1.Model.Account;
import com.HCL.Demo1.Repository.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService{

	
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public void insertAccount(AccountDto account) {
		
		Account acc = new Account();
		acc.setAccountHolder(account.getAccountHolder());
		acc.setAccountNo(account.getAccountNo());
		acc.setBranch(account.getBranch());
		acc.setDate(new Date());
		acc.setEmail(account.getEmail());
		acc.setIfsc(account.getIfsc());
		acc.setMobile(account.getMobile());
		Long accountNo = account.getAccountNo();
		List<Account> accountList = accountRepository.findByAccountNoOrderByVersionDesc(accountNo);
		if(accountList == null || accountList.isEmpty()) {
			acc.setVersion(1);
		}
		else {
		acc.setVersion(accountList.get(0).getVersion() + 1);
		}
		accountRepository.save(acc);
	}

	@Override
	public ResponseDto fetchAccountDetailsAccount(Long accountNo) {
		ResponseDto responseDto = new ResponseDto();
		List<Account> accountList = accountRepository.findByAccountNoOrderByVersionDesc(accountNo);
		responseDto.setAccountList(accountList);
		return responseDto;
	}

	@Override
	public ResponseDto fetchAllAccountDetails() {
		ResponseDto responseDto = new ResponseDto();
		List<Account> accountList = accountRepository.findAll();
		responseDto.setAccountList(accountList);
		return responseDto;
	}

}
