package main.java.com.game.app;

public enum Season {
	spring(1), summer(2), fall(3), winter(4);
	private int id;
	private String name;
	
	Season(int i) {
		this.id=i;
		
		if(i==1) {
			this.name="printemps";
		}
		else if(i==2) {
			this.name="été";
		}
		else if(i==3) {
			this.name="Automne";

		}
		else if(i==4) {
			this.name="hiver";
		}
	}
	public int getId() {
		return id;
	}
	
	public Season next(Season curr) {
		Season result = null;
		if(curr.id==1) {
			result= summer;
		}
		if(curr.id==2) {
			result= fall;
		}
		if(curr.id==3) {
			result= winter;
		}
		if(curr.id==4) {
			result= spring;
		}
		return result;
	}
	
	

	
	
}

