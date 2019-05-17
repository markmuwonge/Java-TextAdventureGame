package com.qa.JavaAssessment_MarkMuwonge;

import java.util.*;

public class MyMain {
	
	private Scanner scanner = new Scanner(System.in);
	private String response = "";
	private boolean treasureFound = false;
	private boolean foundFOI = false;
	private ArrayList<String> options = new ArrayList<>();
	
	private PlayerMove n;
	private PlayerMove e;
	private PlayerMove s;
	private PlayerMove w;
	
	private Player player;
	private FeatureOfInterest featureofinterest;
	
	private float distanceAwayFromFOI = 0.0f;

	public MyMain()
	{
		System.out.println("Text Adventure Game Instructions");
		System.out.println("*******************");	
			
		System.out.println("Start y/n?");
		response = scanner.nextLine();
			
		if (response.equals("y"))
		{
			options.add("north");
			options.add("east");
			options.add("south");
			options.add("west");
			options.add("quit");
			
			 n = new North();
			 e = new East();
			 s = new South();
			 w = new West();
			 
			 player = new Player();
			 
			 featureofinterest = new FeatureOfInterest();
			 go();
		
		}
		else if (response.equals("n"))
		{
			quit();
		}	
	}
	
	public static void main(String[] args) {
		
		MyMain mm = new MyMain();		
	}
	
	private void go()
	{
		dialReads();
		System.out.println("The dial reads " + distanceAwayFromFOI);
		
		if (treasureFound)
		{
			System.out.println("You won");
			System.out.println("You found: " + featureofinterest.getCurrentChoice());
			MyMain mm = new MyMain();
		}
		else if (foundFOI)
		{
			System.out.println("You found: " + featureofinterest.getCurrentChoice());
			foundFOI = false;
			featureofinterest = new FeatureOfInterest();
			go();
		}
		else
		{
			System.out.println("Options: 'north', 'east' 'south', 'west', 'quit'");
			response = scanner.nextLine();
				
			if (options.contains(response))
			{
					
				if (response.equals("north"))
				{		
					playerMove(n, player);
					go();
						
				}
				else if (response.equals("east"))
				{
					playerMove(e, player);
					go();
				}
				else if (response.equals("south"))
				{
					playerMove(s, player);
					go();
				}
				else if (response.equals("west"))
				{
					playerMove(w, player);
					go();
				}
				else 
				{
					quit();
				}
			}
			else
			{
				System.out.println("Response Invalid");
				go();
			}
		}
				
	}
	
	private void playerMove(PlayerMove directionRef, Player p)
	{
		directionRef.moveSomewhere(p);
	}
	
	private void dialReads()
	{
		float x = (player.getxPos() - featureofinterest.getCurrentChoiceXPos()) * (player.getxPos() - featureofinterest.getCurrentChoiceXPos());
		float y = (player.getyPos() - featureofinterest.getCurrentChoiceYPos()) * (player.getyPos() - featureofinterest.getCurrentChoiceYPos());
		distanceAwayFromFOI = (float) Math.sqrt(x+y);
		
		
		if (distanceAwayFromFOI < 2)
		{
			foundFOI = true;
			if (featureofinterest.getCurrentChoice().equals("Treasure"))
			{
				treasureFound = true;
			}
		}
	}
	
	private void quit()
	{
		System.out.println("Game ended.");
	}

}
