package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import junit.framework.TestCase;

/**
 * Created by wz on 14/09/15.
 */
public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
        Log.d("SETUP", "setUp()");
    }	

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }

    public void testTweet() {
	solo.assertCurrentActivity("Wrong activity", LonelyTwitterActivity.class);
	solo.clickOnButton("Clear");
	solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet");
	
	solo.clickOnButton("Save");
	solo.clearEditText((EditText) solo.getView(R.id.body));

	assertTrue(solo.waitForText("Test Tweet", 1, 1000));
	
	solo.clickOnButton("Clear");
	assertFalse(solo.waitForText("Test Tweet"), 1, 1000);
    }

    public void testClickTweetList() {
	solo.assertCurrentActivity("Wrong activity", LonelyTwitterActivity.class);
	solo.clickOnButton("Clear");
	solo.enterText((EditText) solo.getView(R.id.body), "Test Tweet");
	
	solo.clickOnButton("Save");
	solo.clearEditText((EditText) solo.getView(R.id.body));
	assertTrue(solo.waitForText("Test Tweet", 1, 1000));


	final ListView oldTweetsList = activity.getOldTweetsList();
	Tweet tweet = (Tweet) oldTweetsList.getItemAtPosition(0);
	assertEquals("Test Tweet", tweet.getMessage());
	solo.clickInList(0);
	solo.assertCurrentActivity("wrong activity", EditTweetActivity.class);
	
    }

    public void testStart() throws Exception {
         solo.finishOpenedActivity;
    }
}
