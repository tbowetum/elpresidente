package main.java.com.game.app;

import java.util.*;

public class Event {
	private String name;
	private String question;
	private ArrayList<Choice> choices;
	
	
	public Event(String name, String question) {
		this.name = name;
		this.question = question;
	}


	public String getName() {
		return name;
	}


	public String getQuestion() {
		return question;
	}

	public void addChoice(Choice choice) {
		choices.add(choice);
	}

	
	
	
	
}
