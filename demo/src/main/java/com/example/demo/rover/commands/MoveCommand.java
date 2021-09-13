package com.example.demo.rover.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.demo.rover.Direction;
import com.example.demo.rover.RoverContext;

@Component
public class MoveCommand extends Command {
	
	private static final String COMMAND_NAME = "M";
	
	@Override
	public void execute() {
		int locX = roverContext.getX();
		int locY = roverContext.getY();
		Direction direction = roverContext.getDirection();
		
		locX += direction.xIncrease;
		locY += direction.yIncrease;
		
		roverContext.setX(locX);
		roverContext.setY(locY);
	//	roverContext.setDirection(direction);
		System.out.println(roverContext);
	}

	@Override
	public String getCommand() {
		return COMMAND_NAME;
	}

}
