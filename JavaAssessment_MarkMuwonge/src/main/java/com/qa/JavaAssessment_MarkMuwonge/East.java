package com.qa.JavaAssessment_MarkMuwonge;

public class East extends PlayerMove {
	
	public void moveSomewhere(Player p)
	{
		System.out.println("Moving East...");
		p.setxPos(p.getxPos() + 1.0f);		
	}

}
