package main.java.com.game.app;

import java.util.ArrayList;
import java.util.Random;

public class Party {
	
	public enum Difficulty{
		EASY(0.5f), NORMAL(1f), HARD(2f);
		private float multiplier;
		
		Difficulty(float multiplier){
			this.multiplier=multiplier;
		}
		
		public float getMultiplier() {
			return multiplier;
		}
		
	}
	
	private boolean sandboxMode;
	private String title;
	private String description;
	private Difficulty difficulty;
	private ArrayList<Factions> Factions;
	private ArrayList<Seasons> Seasons;
	private Seasons currSeason;
	//list scenarios à rajouter
	private int bribePrice=15;
	private int foodPrice=8;
	
	public Party(String title, String description, Difficulty difficulty, ArrayList<Factions> factions, ArrayList<Seasons> seasons) {
		this.title=title;
		this.description=description;
		this.difficulty=difficulty;
		this.Factions=factions;
		this.Seasons=seasons;
	}
	
	// constructeur pour le mode scenario
	//public Party(String title, String description, Difficulty difficulty, ArrayList<Factions> factions, ArrayList<Seasons> seasons, ) {
	
	public Seasons getRandomSeason() {
		Random random=new Random();
		return Seasons.get(random.nextInt(Seasons.size()));
	}
	
	
	
	
}
