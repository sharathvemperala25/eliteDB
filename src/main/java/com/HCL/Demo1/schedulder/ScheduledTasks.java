package com.HCL.Demo1.schedulder;

import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.HCL.Demo1.Dto.ResponseDto;
import com.HCL.Demo1.Service.AccountService;

@Component
public class ScheduledTasks {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    
  
    
    @Autowired
    AccountService accountService;

    @Scheduled(fixedRate = 10000)
    public void scheduleTaskWithFixedRate() {
   
    	ResponseDto result = new ResponseDto();
    	 result = accountService.fetchAllAccountDetails();
    	
    	System.out.println("break");
    	
    }
    
 


}
