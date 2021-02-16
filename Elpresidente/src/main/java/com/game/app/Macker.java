package main.java.com.game.app;

public enum Macker {
	industry(15), 
	Agriculture(15), 
	Treasury(200);
	
	private int value;

	private Macker(int value) {
		this.value = value;
	}

	public int getAmount() {
		return value;
	}

	public void increaseVal(int val) {
		if(Agriculture == Agriculture) {
			int i = this.Agriculture.getAmount();
			i+= val;
			System.out.println(i);
		}
		else if(industry==industry) {
			int i = this.industry.getAmount();
			i+= val;
			System.out.println(i);
		}
		else if(Treasury==Treasury) {
			int i = this.Treasury.getAmount();
			i+= val;
			System.out.println(i);
		}
		else {
			System.out.println("n");
		}
	}
	
	public void dicreaseVal(int val) {
		if(Agriculture == Agriculture) {
			int i = this.Agriculture.getAmount();
			i-= val;
			System.out.println(i);
		}
		else if(industry==industry) {
			int i = this.industry.getAmount();
			i-= val;
			System.out.println(i);
		}
		else if(Treasury==Treasury) {
			int i = this.Treasury.getAmount();
			i-= val;
			System.out.println(i);
		}
		else {
			System.out.println("n");
		}
	}

}
