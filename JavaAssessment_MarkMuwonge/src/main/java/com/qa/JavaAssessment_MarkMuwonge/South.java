package com.qa.JavaAssessment_MarkMuwonge;

public class South extends PlayerMove  {
	
	public void moveSomewhere(Player p)
	{
		System.out.println("Moving South...");
		p.setyPos(p.getyPos() - 1.0f);	
	}

}
