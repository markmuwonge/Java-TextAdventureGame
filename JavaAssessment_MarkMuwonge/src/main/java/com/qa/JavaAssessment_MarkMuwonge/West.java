package com.qa.JavaAssessment_MarkMuwonge;

public class West  extends PlayerMove  {
	
	public void moveSomewhere(Player p)
	{
		System.out.println("Moving West...");
		p.setxPos(p.getxPos() - 1.0f);	
	}

}
