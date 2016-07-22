/**
 * 
 */

/**
 * @author pbulsink
 *
 */

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Team {
	
	private int currentElo = 1500;
	private static Map<Calendar, Integer> allElo = new HashMap<>();
	private String name;
	private Calendar foundingDate = Calendar.getInstance();
	private Calendar closingDate = Calendar.getInstance();
	private List<String> alternateNames = new ArrayList<String>();
	
	public Team(String name, Calendar founded){
		this.name=name;
		this.foundingDate=founded;
	}
	
	public void addClosingDate(Calendar closed){
		this.closingDate = closed;
	}
	
	public int getCurrentElo(){
		return this.currentElo;
	}
	
	public void addElo(Calendar gameDate, int newElo){
		this.currentElo = newElo;
		this.allElo.put(gameDate, newElo);
	}
	
	public void addAlternateName(String altName){
		this.alternateNames.add(altName);
	}
}
