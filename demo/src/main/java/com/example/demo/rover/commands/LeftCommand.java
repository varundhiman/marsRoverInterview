package com.example.demo.rover.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.demo.rover.Direction;
import com.example.demo.rover.RoverContext;

@Component
public class LeftCommand extends Command {
	
	private static final String COMMAND_NAME = "L";
	
	@Override
	public void execute() {
		Direction direction = roverContext.getDirection();
		
		roverContext.setDirection(direction.leftDirection);
		System.out.println(roverContext);
	}

	@Override
	public String getCommand() {
		return COMMAND_NAME;
	}

}
