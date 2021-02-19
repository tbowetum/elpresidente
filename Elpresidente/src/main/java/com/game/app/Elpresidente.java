package main.java.com.game.app;

import java.util.ArrayList;
import java.util.Scanner;

public class Elpresidente {
	
	private String answer;

	public Elpresidente(String answer) {
		super();
		this.answer = answer;
	}

	public String getAnswer() {
		return answer;
	}



	public void show() {
		String output;
		Scanner scan = new Scanner(System.in);

		do {
			output = null;

			System.out.println("- El Presidente -");
			System.out.println("1 - Play");
			System.out.println("2 - Quit");
			System.out.println("Make a choice :");

			output = scan.nextLine();

			switch (output) {
			case ("1"):
				Play p = new Play();
				p.show();
				
				break;
			case ("2"):
				
				break;
			}

		} while (!output.equals("5"));
		
	}
	
	

}
