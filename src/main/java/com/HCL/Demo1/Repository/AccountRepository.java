package com.HCL.Demo1.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HCL.Demo1.Model.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {
	public Optional<Account> findFirstByAccountNo(Long accountId);
	

	 
	 List<Account> findByAccountNoOrderByVersionDesc(Long accountNo);
	 
	// List<Account> findByAccountNo(Long accountNo);
	 
}
