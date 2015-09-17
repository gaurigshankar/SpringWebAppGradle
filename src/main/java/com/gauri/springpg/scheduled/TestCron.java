package com.gauri.springpg.scheduled;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class TestCron {
	@Scheduled(cron = "* * * * * *")
	public void updateEmployeeInventory(){
	    System.out.println("Started cron job");
	    /**
	     * add your scheduled job logic here
	     */
	}
}
