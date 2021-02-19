package main.java.com.game.app;


import java.time.Year;
import java.util.*;

public class Seasons {
	
	private Year date;
	private Event event;
	private Season season;
	
	public Seasons(Year date, Event event, Season season) {
		super();
		this.date = date;
		this.event = event;
		this.season = season;
	}

	public Year getDate() {
		return date;
	}

	public Event getEvent() {
		return event;
	}

	public Season getSeason() {
		return season;
	}

	@Override
	public String toString() {
		return String.format("Seasons [date=%s, event=%s, season=%s]", date, event, season);
	}
}
