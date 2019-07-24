package com.HCL.Demo1.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	@GeneratedValue
	private Long id;
	private Long accountNo;
	private String AccountHolder;
	private String Ifsc;
	private String Branch;
	private String email;
	private Date date;
	private Long mobile;
	private int version;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolder() {
		return AccountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}
	public String getIfsc() {
		return Ifsc;
	}
	public void setIfsc(String ifsc) {
		Ifsc = ifsc;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
		
		
		
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	
}
