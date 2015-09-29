package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by qingdai on 9/28/15.
 */
public class TweetArray {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void addTweet(Tweet tweet) throws IllegalArgumentException {
        tweets.add(tweet);
    }

    public  getTweet(Tweet tweet) {
        for (int m = 0, m< tweet.size(),m++){
            return System.out.print(tweet.get(m));
        }
    }
}
