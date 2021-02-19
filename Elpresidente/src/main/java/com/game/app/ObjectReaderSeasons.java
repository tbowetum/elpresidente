package main.java.com.game.app;

public class ObjectReaderSeasons extends ObjectReaderBase<Seasons>{

	@Override
	public String url() {
		return "..\\Elpresidente\\src\\main\\java\\com\\game\\app\\question";
	}
	
	@Override
	public MapperBase<Seasons> getMapper() {
		return new MapperSeason();
	}
}
