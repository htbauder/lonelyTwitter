package ca.ualberta.cs.lonelytwitter;

// created by Hayden Bauder

import java.util.Date;

public class Happy extends Mood {

	public Happy(){
		super();
	}

	public Happy(Date date) {
		super(date)
	}

	public void printMood() {
		System.out.println("I am Happy.\n");
	}
}

