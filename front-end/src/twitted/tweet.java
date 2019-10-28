package twitted;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class tweet {

		public static void tweet(String[] args1) throws TwitterException {
			// TODO Auto-generated method stub
			ConfigurationBuilder cb = new ConfigurationBuilder();
			cb.setDebugEnabled(true)
			  .setOAuthConsumerKey("AQn3g1yDefDpvYLvvdRmLiUxe")
			  .setOAuthConsumerSecret("R3Hxr7MXbaPEQ08AiLJa4abEpsCT3mvxHN2oiUNkP2J1xd5kfN")
			  .setOAuthAccessToken("913134425038376965-pX8TiXGYEGTb5EvNHziaC3n8HiEZhUU")
			  .setOAuthAccessTokenSecret("RHrUvc3n0FAMm2cTfDDv7IHbqHLsWKwncwMDEUNg2s97D");
			TwitterFactory tf = new TwitterFactory(cb.build());
			Twitter twitter = tf.getInstance();
			//@AdhLecturer
			twitter.updateStatus("@AdhLecturer 203221959 ADH Project");
		   // return status.getText();
		}
	}



