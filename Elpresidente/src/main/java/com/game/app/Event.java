package main.java.com.game.app;

import java.util.*;

public class Event {
	private String eventName;
	private String evenSolution;
	private Faction faction;
	
	public Event(String eventName, String evenSolution, Faction faction) {
		super();
		this.eventName = eventName;
		this.evenSolution = evenSolution;
		this.faction = faction;
	}

	public String getEventName() {
		return eventName;
	}

	public String getEvenSolution() {
		return evenSolution;
	}

	public Faction getFaction() {
		return faction;
	}

	@Override
	public String toString() {
		return String.format("Event [eventName=%s, evenSolution=%s, faction=%s]", eventName, evenSolution, faction);
	}

	
}
