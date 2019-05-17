package com.qa.JavaAssessment_MarkMuwonge;

import java.util.Random;

public class Player {
	Random value;
	private float xPos = 0.0f;
	private float yPos = 0.0f;
	
	public Player()
	{
		value = new Random();
		xPos = value.nextFloat() * 5;
		
		value = new Random();
		yPos = value.nextFloat() * 5;
	}
	
	public float getxPos() {
		return xPos;
	}
	public void setxPos(float xPos) {
		this.xPos = xPos;
	}
	public float getyPos() {
		return yPos;
	}
	public void setyPos(float yPos) {
		this.yPos = yPos;
	}
	
	
	

	

}
