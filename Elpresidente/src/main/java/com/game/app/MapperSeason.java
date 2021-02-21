package main.java.com.game.app;

import java.io.*;
import java.time.Year;
import java.util.*;

public class MapperSeason extends MapperBase<Seasons> {

	@Override
	protected Seasons Map(String[] record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString(Seasons data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean areEquals(Seasons data1, Seasons data2) {
		// TODO Auto-generated method stub
		return false;
	}
		/*protected Seasons Map(String[] record) {
			Year yr = Year.parse(record[0]);
			Event e = new Event(record[1], record[2], Faction.valueOf(record[3]), Macker.valueOf(record[4]));
			Season s = Season.valueOf(record[5]);
			
			Seasons season = new Seasons(yr, e, s);
			return season;
		}

		public String toString(Seasons data) {
			return null;
		}

		public boolean areEquals(Seasons data1, Seasons data2) {
			return false;
		}*/

}
