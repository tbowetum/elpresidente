package main.java.com.game.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
        Factions f = new Factions(15, 100);
        Macker e = Macker.Agriculture ;
        
        e.increaseVal(45);
        
        //System.out.println(e.getAmount());
        
    }
}
