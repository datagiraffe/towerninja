package net.codegames.towerninja;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Score implements Comparable<Score>, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 301735992505840227L;
	private int score = 0;
	private String name;
	private String time = "00:00";
	
	public Score (){
		name = randomName();
	}
	public int addScore(int n)
	{
		this.score += n;  
		if(this.score < 0)
			this.score = 0;
		return this.score;
	}
	
	public int score()
	{
		
		return this.score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
		if(this.score < 0)
			this.score = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int compareTo(Score compareObject) {
		if (this.getScore() < compareObject.getScore())
            return 1;
        else if (this.getScore() == compareObject.getScore())
            return 0;
        else
            return -1;
	}

	private String randomName(){
		Date dt = new Date();

		SimpleDateFormat df = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
		df.setTimeZone( TimeZone.getDefault() );                 

		String date = df.format( dt );
		return date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
