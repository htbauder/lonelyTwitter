package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

public class TweetListTest extends ActivityInstrumentationTestCase2 {
	public TweetListTest() {
		super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
	}

	public void testAddTweet() {
		//assertTrue(Boolean.TRUE);
		TweetList tweets = new TweetList();
		Tweet tweet = new NormalTweet("adding Tweet");
		tweets.add(tweet);
		assertTrue(tweets.hasTweet(tweet));
	}
}
