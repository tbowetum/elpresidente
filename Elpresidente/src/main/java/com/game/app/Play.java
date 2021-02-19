package main.java.com.game.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Play {
	
	private Faction nbSup;
	protected int satisfaction;
	
	public Play(int nbSup, int satisfaction) {
		super();
		this.nbSup.supporter = 15;
		this.satisfaction = satisfaction;
	}
	
	public Play() {
		super();
	}

	public void show() {
		ObjectReaderSeasons obj = new ObjectReaderSeasons();
		ArrayList<Seasons> seasons =obj.execute();
		
		
		String output;
		Scanner scan = new Scanner(System.in);
		output = null;
		do {
			for(Seasons s: seasons) {
				s.getDate();
				
				System.out.println("-Année :");
				System.out.printf("%s ", "Année :", s.getDate().getValue());
				System.out.println(s.getEvent().getEventName());
				System.out.printf("1 - Play", s.getEvent().getEvenSolution() );
				System.out.println("2 - No reaction");
				System.out.println("Make a choice :");
	
				output = scan.nextLine();
				switch (output) {
				case ("1"):
					
					break;
				case ("2"):
					s.getEvent().getFaction().reduceSupporter(5);					
					break;
				}}

		} 
		while (!output.equals(" "));
		
	}
	
	
	

}
