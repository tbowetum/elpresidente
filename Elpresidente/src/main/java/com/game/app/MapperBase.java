package main.java.com.game.app;

import java.util.ArrayList;

public abstract class MapperBase<T> {
	protected abstract T Map(String[] record);
	public abstract String toString(T data);
	public abstract boolean areEquals(T data1, T data2);
	
	public ArrayList<T> MapAll(String[] lines){
		ArrayList<T> collection = new ArrayList<T>();
		for(String line : lines) {
			T item = Map(line.split(";"));
			if(item != null) {
				collection.add(item);
			}
		}
		return collection;
	}
}
