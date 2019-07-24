package com.HCL.Demo1.Service;

import com.HCL.Demo1.Dto.AccountDto;
import com.HCL.Demo1.Dto.ResponseDto;

public interface AccountService {

	public void insertAccount(AccountDto account);

	public ResponseDto fetchAccountDetailsAccount(Long accountNo);

	public ResponseDto fetchAllAccountDetails();
}
