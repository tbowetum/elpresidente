package main.java.com.game.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class ObjectReaderBase<T> {
	public abstract String url();
	public abstract MapperBase<T> getMapper();
	

	public ArrayList<T> execute(){
		ArrayList<T> collection = new ArrayList<T>();
		ArrayList<String> lines = new ArrayList<String>();
		try(BufferedReader br = new BufferedReader(new FileReader(url()))){
			for(String line; (line = br.readLine()) != null;) {
				lines.add(line);
			}
			MapperBase<T> mapper = getMapper();
			if(mapper != null) {
				collection = mapper.MapAll(lines.toArray(new String[1]));
			} 
		} catch (IOException e) {}
			
		return collection;
	}
}
