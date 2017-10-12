package ca.ualberta.cs.lonelytwitter

public class TweetList {
	private ArrayList<Tweet> tweets = new ArrayList<Tweets>();

	public TweetList() {

	}

	public void add(Tweet tweet) {
		tweets.add(tweet);
	}

	public boolean hasTweet(Tweet tweet) {
		return tweets.contains(tweet);
	}
}
