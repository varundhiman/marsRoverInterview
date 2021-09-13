package com.example.demo.rover;

public enum Direction {
	
	
	NORTH(0,1),SOUTH(0,-1), EAST(1,0), WEST(-1,0);
	
	public int xIncrease, yIncrease;
	public Direction leftDirection, rightDirection;
	
	Direction(int xinc, int yinc) {
		this.xIncrease=xinc;
		this.yIncrease=yinc;
		//this.leftDirection=leftDirection;
		//this.rightDirection=rightDirection;
	}
	


}
