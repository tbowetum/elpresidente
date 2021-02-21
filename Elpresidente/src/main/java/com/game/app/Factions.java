package main.java.com.game.app;

import java.util.ArrayList;

public class Factions {
	
	private String name;
	private float satisfactionPercentage;
	private int nbSupporters;
	private ArrayList<Factions> listFactions;
	
	public Factions(String name) {
		this.name=name;
		this.satisfactionPercentage=0;
		this.nbSupporters=15;
	}

	public String getName() {
		return name;
	}

	

	public float getSatisfactionPercentage() {
		return satisfactionPercentage;
	}

	public void setSatisfactionPercentage(float satisfactionPercentage) {
		if(satisfactionPercentage<=0 ) {
			this.satisfactionPercentage = 0;
			
		}
		else if(satisfactionPercentage>=100){
			this.satisfactionPercentage=100;
		}
		else {
			this.satisfactionPercentage=satisfactionPercentage;
		}
	
	}
	
	

	public int getNbSupporters() {
		return nbSupporters;
	}

	public void setNbSupporters(int nbSupporters) {
		this.nbSupporters = nbSupporters;
	}
	private void addFaction(Factions faction) {
		listFactions.add(faction);
	}

	@Override
	public String toString() {
		return "Factions [name=" + name + "]";
	}
	public void getFaction(String name) {
		
	}
	
	
	

}
