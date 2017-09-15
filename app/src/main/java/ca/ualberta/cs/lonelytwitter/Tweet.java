package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements Tweetable {

	private String message;
	private Date date;
	private ArrayList<Mood> moods; // Give tweets a list of Moods


	public Tweet(String message){
		this.message = message;
		this.date = new Date();
		this.moods = new ArrayList<Mood>();
	}

	public Tweet(String message, Date date) {
		this.message = message;
		this.date = date;
		this.moods = new ArrayList<Mood>();
	}

	public void setDate(Date date){
		this.date = date;
	}

	public Date getDate(){
		return date;
	}
	
	public String getMessage(){
		return message;
	}

	public void setMessage(String message) throws TweetTooLongException{
		if (message.length() <= 140) {
			this.message = message;
		}
		else {
			throw new TweetTooLongException();
		}
	}

	public void addMood(Mood m) {
		this.moods.add(m);	// add the mood to the tweet
	}

	public void printMoods() {
		for (Mood m : moods) {
			m.printMood();
		}
	}

	public abstract Boolean isImportant();
} 
