package ca.ualberta.cs.lonelytwitter;

// created by Hayden Bauder

import java.util.Date;
import android.util.Log;

public class Happy extends Mood {

	public Happy(){
		super();
	}

	public Happy(Date date) {
		super(date);
	}

	public void printMood() {
		Log.d("Print mood: ", "I am Happy.");
	}
}

