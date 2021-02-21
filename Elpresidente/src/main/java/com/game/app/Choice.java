package main.java.com.game.app;

import java.util.HashMap;

public class Choice {
	
	private String content;// 
	private HashMap<String, Integer> factionConsequences;
	private HashMap<String, Integer> markerConsequences;
	private int treasury;
	
	

	public Choice(String content, int treasury, HashMap<String, Integer> factionConsequences, HashMap<String, Integer> markerConsequences)
		
	{
		this.content=content;
		this.treasury=treasury;
		this.factionConsequences=factionConsequences;
		this.markerConsequences=markerConsequences;
	}

	public String getContent() {
		return content;
	}


	public HashMap<String, Integer> getFactionConsequences() {
		return factionConsequences;
	}


	public HashMap<String, Integer> getMarkerConsequences() {
		return markerConsequences;
	}


	public int getTreasury() {
		return treasury;
	}

	@Override
	public String toString() {
		return "[ " + content + " ]";
	}

	
		
	
}
