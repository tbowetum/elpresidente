package main.java.com.game.app;

import java.util.ArrayList;

public class Marker{
	private ArrayList<Marker> listMarkers;
	private String name;
	private float percentage;
	
	public Marker(String name) {
		this.name=name;
		this.percentage=0;
	}

	public String getName() {
		return name;
	}


	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		if(percentage<=0 ) {
			this.percentage = 0;
			
		}
		else if(percentage>=100){
			this.percentage=100;
		}
		else {
			this.percentage=percentage;
		}
	}
	
	public void addMarker(Marker marker) {
		listMarkers.add(marker);
	}
	public int calculmoney() {
		return (int)(percentage*10);
	}

	@Override
	public String toString() {
		return "Marker [name=" + name + ", percentage=" + percentage + "]";
	}
	
	
}

