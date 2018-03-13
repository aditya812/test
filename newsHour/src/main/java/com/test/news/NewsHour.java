package com.test.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewsHour {

	public static void main(String[] args) {
		System.out.println("Test Branch Commit");
		System.out.println("Master Commit");
		// TODO Auto-generated method stub
		SpringApplication.run(NewsHour.class, args);
		System.out.println("Master Commit");
		System.out.println("Test Branch Commit");
	}

}	
