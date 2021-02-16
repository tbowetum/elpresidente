package main.java.com.game.app;

public enum Faction {
	capitalists(15, 50), Communists(15,50), Ecologists(15,50), liberals(15,50), Loyalists(15,100), Militarists(15,50), Nationalists(15,50), religious(15,50);

	int i, j;
	private Faction(int i, int j) {
		this.i = i;
		this.j = j;
	}
}
