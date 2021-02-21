package main.java.com.game.app;

public enum Faction {
	capitalists(15, 50), 
	Communists(15,50), 
	Ecologists(15,50), 
	liberals(15,50), 
	Loyalists(15,100), 
	Militarists(15,50), 
	Nationalists(15,50), 
	religious(15,50);

	
	int supporter, satisfaction;
	private Faction(int supporter, int satisfaction) {
		this.supporter = supporter;
		this.satisfaction = satisfaction;
	}
	public int getSupporter() {
		return supporter;
	}
	
	public int getSatisfaction() {
		return satisfaction;
	}
	
	public int addSupporter(int sup) {
		int i= supporter;
		i+=sup;
		return i;
	}

	public int addSatisfaction(int sat) {
		int i= satisfaction;
		i+=sat;
		return i;
	}
	
	public int reduceSupporter(int sup) {
		int i= supporter;
		i-=sup;
		return i;
	}

	public int reduceSatisfaction(int sat) {
		int i= satisfaction;
		i-=sat;
		return i;
	}
	
	
	
	
	

}
