package com.HCL.Demo1.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.HCL.Demo1.Model.Account;

public interface AccountRepository extends JpaRepository<Account,Long> {
	public Optional<Account> findFirstByAccountNo(Long accountId);
	
	//@Query("select max(d.version) from Account d where d.accountNo = :accountNo")
	//public Optional<Account> maxVersionforAccountNo(@Param("accNo") Long accountNo);

	 
	 List<Account> findByAccountNoOrderByVersionDesc(Long accountNo);
}
