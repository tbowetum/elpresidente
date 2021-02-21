package main.java.com.game.app;


import java.time.Year;
import java.util.*;

public class Seasons {
	
	private Year date;
	private ArrayList<Event> events;
	private Season season;
	
	public Seasons(Year date, Season season) {
		super();
		this.date = date;
	
		this.season = season;
	}

	public Year getDate() {
		return date;
	}

	

	public Season getSeason() {
		return season;
	}
	
	public void addEvent(Event event) {
		events.add(event);
	}
	
	
}
