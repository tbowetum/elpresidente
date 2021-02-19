package main.java.com.game.app;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Start {
	
	public void show() throws FileNotFoundException, IOException {
		String output;
		Scanner scan = new Scanner(System.in);
		
		do {	
			output = null;
			
			System.out.println("- El presidente-");
			System.out.println("1 - Play");
			System.out.println("2 - Quitter");	
			System.out.println("Entrez votre choix :");	
			
			output = scan.nextLine();
			
			switch(output){
				case("1"):
					Play faction = new Play();
					faction.show();
					break;
			}
		}while(!output.equals("2"));
	}
}
