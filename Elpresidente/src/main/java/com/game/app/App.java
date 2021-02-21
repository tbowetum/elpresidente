package main.java.com.game.app;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.JSONParser;
import net.sf.json.*;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException {
        
    	Play p = new Play();
    	p.getInfo();
    	
    }
}