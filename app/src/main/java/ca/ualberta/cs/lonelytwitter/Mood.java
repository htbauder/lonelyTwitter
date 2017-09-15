package ca.ualberta.cs.lonelytwitter;

// created by Hayden Bauder

import java.util.Date;

public abstract class Mood {

	private Date date;

	public Mood(){
		this.date = new Date();
	}

	public Mood(Date date){
		this.date = date;
		
	}

	public abstract void printMood();

	public Date getDate(){
		return date;
	}

	public void setDate(int value){
		this.date = value;
	}
}


