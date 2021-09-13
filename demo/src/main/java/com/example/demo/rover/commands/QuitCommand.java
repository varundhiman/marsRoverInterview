package com.example.demo.rover.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.demo.rover.Direction;
import com.example.demo.rover.RoverContext;

@Component
public class QuitCommand extends Command {
	
	private static final String COMMAND_NAME = "Q";
	
	
	@Override
	public void execute() {
		System.out.println("Robot shutting down");
		System.exit(0);
	}	

	@Override
	public String getCommand() {
		return "Q";
	}

}
