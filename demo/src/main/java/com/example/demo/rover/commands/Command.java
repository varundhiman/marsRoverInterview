package com.example.demo.rover.commands;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import com.example.demo.rover.RoverContext;

public abstract class Command {
	
	@Autowired
	RoverContext roverContext;

	
	public abstract void execute();
	
	public abstract String getCommand();
	
	@EventListener(ContextRefreshedEvent.class)
	public void register() {
		roverContext.registerCommand(getCommand(), this);

	}

}
