package com.HCL.Demo1.Dto;

import java.util.List;

import com.HCL.Demo1.Model.Account;

public class ResponseDto {
	
	private List<Account> accountList;

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	
	
}
