/**
 * 
 */

/**
 * @author pbulsink
 *
 */

// imports
import java.util.Calendar;

public class Game {

	/**
	 * @param args
	 */
	
	private Calendar gameDate = Calendar.getInstance();
	private Team visitorTeam = new Team();
	private Team homeTeam = new Team();
	private int visitorGoals;
	private int homeGoals;
	/*
	 * Options: 
	 * "" - Regular time (default),
	 * "OT" - Overtime (Also 2OT, 3OT, etc for extra OT periods)
	 * "SO" - Shootout 
	 */	
	private String gameType = "";
	private String gameNotes = "";
	private int gameAttendance;
	
	/** 
	 * @param gameDate - String date from data (will be converted)
	 * @param visitorTeam - String visitor team from data (will be converted)
	 * @param visitorGoals - int Visitor Goals
	 * @param homeTeam - String home team from data (will be converted)
	 * @param homeGoals - int Home Goals
	 * @param att - int attendance from data if exists
	 * @param gameNotes - String game notes (if exists) from data (will be converted)
	 */

	public Game(String gameString) 
	{
		String [] gameInfo = gameString.split(",");
		String [] dateString = gameInfo[0].split("-");
		
		this.gameDate.set(Integer.parseInt(dateString[0]), 
				Integer.parseInt(dateString[1]), 
				Integer.parseInt(dateString[2]));
		//this.visitor = gameInfo[1];
		this.visitorGoals = Integer.parseInt(gameInfo[2]);
		//this.home = gameInfo[3];
		this.homeGoals = Integer.parseInt(gameInfo[4]);
		this.gameType = gameInfo[5];
		this.gameAttendance = Integer.parseInt(gameInfo[6]);
		this.gameNotes = gameInfo[8];
	}
	
	public Team getWinner()
	{
		if (visitorGoals > homeGoals)
		{
			return visitorTeam;
		}
		else if (visitorGoals == homeGoals)
		{
			return null;
		}
		else
		{
			return homeTeam;
		}
	}
	
	public String getGameType()
	{
		return gameType;
	}
	
	public Calendar getGameDate()
	{
		return gameDate;
	}
	
	public String getGameNotes()
	{
		return gameNotes;
	}

	public Team getHomeTeam()
	{
		return homeTeam;
	}
	
	public Team getVisitorTeam()
	{
		return visitorTeam;
	}
	
	public int getAttendance()
	{
		return gameAttendance;
	}
}
