/**
 * 
 */

/**
 * @author pbulsink
 *
 */

// imports
import java.util.Date;

public class Game {

	/**
	 * @param args
	 */
	
	public Date gameDate = new Date();
	public Team visitor = new Team();
	public Team home = new Team();
	public int visitorGoals;
	public int homeGoals;
	/*
	 * Options: 
	 * "" - Regular time (default),
	 * "OT" - Overtime (Also 2OT, 3OT, etc for extra OT periods)
	 * "SO" - Shootout 
	 */	
	public String gameType = "";
	public String notes = "";
	public int attendance;
	
	/** 
	 * @param gameDate - String date from data (will be converted)
	 * @param visitorTeam - String visitor team from data (will be converted)
	 * @param visitorGoals - int Visitor Goals
	 * @param homeTeam - String home team from data (will be converted)
	 * @param homeGoals - int Home Goals
	 * @param att - int attendance from data if exists
	 * @param gameNotes - String game notes (if exists) from data (will be converted)
	 */
	
	public Game(){
		
	}
	
	public Game(String gameDate, 
			String visitorTeam, 
			int visitorGoals, 
			String homeTeam, 
			int homeGoals) {
		
	}

}
