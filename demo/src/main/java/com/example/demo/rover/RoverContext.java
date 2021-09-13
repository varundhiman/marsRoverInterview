package com.example.demo.rover;

import static com.example.demo.rover.Direction.EAST;
import static com.example.demo.rover.Direction.NORTH;
import static com.example.demo.rover.Direction.SOUTH;
import static com.example.demo.rover.Direction.WEST;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.example.demo.rover.commands.Command;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString(exclude={"commandMap"})
public class RoverContext {
	
	int x =0, y=0;
	Direction direction = NORTH;
	
	
	//Map<Robots (roverCtxt)>
	
	Map<String, Command> commandMap = new HashMap<>();
	
	public void registerCommand (String comandName, Command command) {
		commandMap.put(comandName, command);
	}
	
	public Command getComamnd (String operation) {
		return operation==null?null : commandMap.get(operation.toUpperCase());
	}
	
	
	@EventListener(ContextRefreshedEvent.class)
	public void alignDirections () {
		NORTH.leftDirection = WEST;
		NORTH.rightDirection = EAST;
		
		WEST.leftDirection = SOUTH;
		WEST.rightDirection = NORTH;
		
		SOUTH.leftDirection = EAST;
		SOUTH.rightDirection = WEST;
		
		EAST.leftDirection = NORTH;
		EAST.rightDirection = SOUTH;
	}
	
	
	

}
