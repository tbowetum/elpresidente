package main.java.com.game.app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import com.google.gson.*;
/*import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;*/

public class Play{
	Seasons season;
	public Play() {
		
	}
	
	@SuppressWarnings("deprecation")
	public void getInfo() {
	JsonParser jsonP = new JsonParser();
		
	      try {
	    	  
	         Object jsonO = jsonP.parse(new FileReader("..\\elpresidente 2\\Elpresidente\\src\\main\\java\\com\\game\\app\\Seasons.json"));
	         JsonObject jsonObject = (JsonObject) jsonO;
	         String date = jsonObject.get("date").getAsString();
	         Season season = Season.valueOf(jsonObject.get("season").getAsString());
	         
	         
	         JsonArray event = (JsonArray)jsonObject.get("event").getAsJsonArray();
	         
	         /*for (JsonElement i : event) {
	        	 System.out.println(i);
	         }*/ 
	         System.out.println(date);
	         System.out.println(season);
	         //System.out.println(event);
	         
	        
	      } 
	      catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } 
	      catch (IOException e) {
	         e.printStackTrace();
	      } 
	      
	}
		
	

}
