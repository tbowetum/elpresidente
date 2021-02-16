package main.java.com.game.app;

public class Factions {
	
	private int nbpartisans = 15;
	protected int satisfactions;
	
	public Factions(int nbpartisans, int satisfactions) {
		super();
		this.nbpartisans = nbpartisans;
		this.satisfactions = satisfactions;
	}
	
	public int getNbpartisans() {
		return nbpartisans;
	}
	
	public int getSatisfactions() {
		return satisfactions;
	}

	@Override
	public String toString() {
		return "Factions [nbpartisans=" + nbpartisans + ", satisfactions=" + satisfactions + "]";
	}
	
	
	

}
