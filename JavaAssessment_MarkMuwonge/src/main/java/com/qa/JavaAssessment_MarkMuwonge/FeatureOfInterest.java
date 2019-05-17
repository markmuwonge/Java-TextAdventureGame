package com.qa.JavaAssessment_MarkMuwonge;

import java.util.Random;

public class FeatureOfInterest {
	Random value;
	
	private String[] choices = {"Treasure","Water","Food","Book",""};
	private String currentChoice = "";
	private float currentChoiceXPos = 10.0f;
	private float currentChoiceYPos = 10.0f;
	
	public FeatureOfInterest()
	{
		value = new Random();
		currentChoice = choices[value.nextInt(3)];
		
//		value = new Random();
//		currentChoiceXPos = value.nextFloat() * 10;
//		
//		value = new Random();
//		currentChoiceYPos = value.nextFloat() * 10;
	}
	
	public String getCurrentChoice() {
		return currentChoice;
	}
	public void setCurrentChoice(String currentChoice) {
		this.currentChoice = currentChoice;
	}
	public float getCurrentChoiceXPos() {
		return currentChoiceXPos;
	}
	public void setCurrentChoiceXPos(float currentChoiceXPos) {
		this.currentChoiceXPos = currentChoiceXPos;
	}
	public float getCurrentChoiceYPos() {
		return currentChoiceYPos;
	}
	public void setCurrentChoiceYPos(float currentChoiceYPos) {
		this.currentChoiceYPos = currentChoiceYPos;
	}
	
	
	

	
	
	

}
