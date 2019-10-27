package com.javapapers.java;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class JavaTweet {

	static String consumerKeyStr = "AQn3g1yDefDpvYLvvdRmLiUxe";
	static String consumerSecretStr = "R3Hxr7MXbaPEQ08AiLJa4abEpsCT3mvxHN2oiUNkP2J1xd5kfN";
	static String accessTokenStr = "913134425038376965-pX8TiXGYEGTb5EvNHziaC3n8HiEZhUU";
	static String accessTokenSecretStr = "RHrUvc3n0FAMm2cTfDDv7IHbqHLsWKwncwMDEUNg2s97D";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Twitter twitter = new TwitterFactory().getInstance();

			twitter.setOAuthConsumer(consumerKeyStr, consumerSecretStr);
			AccessToken accessToken = new AccessToken(accessTokenStr,
					accessTokenSecretStr);

			twitter.setOAuthAccessToken(accessToken);

			twitter.updateStatus("Post using Twitter4J Again");

			System.out.println("Successfully updated the status in Twitter.");
		} catch (TwitterException te) {
			te.printStackTrace();
		}
	}

}
