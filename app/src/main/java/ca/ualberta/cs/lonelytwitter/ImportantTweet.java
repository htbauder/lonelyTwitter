package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet {

	public ImportantTweet(String message) [
		super(message);
	}

	public ImportantTweet(Sting message, Date date){
		super(message, date);
	}

	@Override
	public Boolean isImportant() {
		return Boolean.TRUE;
	}
}
