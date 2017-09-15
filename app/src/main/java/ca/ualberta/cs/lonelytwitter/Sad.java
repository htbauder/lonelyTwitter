package ca.ualberta.cs.lonelytwitter;

// created by Hayden Bauder

import java.util.Date;

public class Sad extends Mood {

	public Sad(){
		super();
	}

	public Sad(Date date) {
		super(date)
	}

	public void printMood() {
		System.out.println("I am Sad.\n");
	}
}
