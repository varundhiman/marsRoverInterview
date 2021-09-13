package com.example.demo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.rover.RoverService;
import java.util.Scanner;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	
	@Autowired
	RoverService roverService;
	
	boolean exit = false;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//List ops = List.of("M", "L", "L", "M", "M", "R", "R", "M", "Q", "M");
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			
			String op = scanner.next();
			roverService.operateRover(Arrays.asList(op));
		}
		
	//	roverService.operateRover(Arrays.asList(args));
	}

}
