package com.qa.JavaAssessment_MarkMuwonge;

import java.util.Random;

public class North extends PlayerMove {
	
	Random rand = new Random();
	public void moveSomewhere(Player p)
	{
		System.out.println("Moving north...");
		p.setyPos(p.getyPos() + 1.0f);		
	}

}
