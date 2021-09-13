package com.example.demo.rover;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.rover.commands.Command;

@Component
public class RoverService {
	
	@Autowired
	RoverContext roverContext;
	
	public void operateRover (List<String> operations) {
		for(String operation : operations) {
			Command command = roverContext.getComamnd(operation);
			if(command==null) {
				System.out.println("Invalid Command");
				return;
			}			
			command.execute();
		}				
	}	

}
