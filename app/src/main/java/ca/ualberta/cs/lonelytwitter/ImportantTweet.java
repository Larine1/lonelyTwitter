package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.Date;

/**
 * Created by qingdai on 9/14/15.
 */
public class ImportantTweet extends Tweet implements Tweetable{
//    extends Tweet inheritance
//    make subclass:ImportantTweet is the subclass of Tweet
    public ImportantTweet(String tweet, Date date) {
        super(tweet, date);
//      super class
    }

//    make subclass/ getter/ setter
    public ImportantTweet(String text) throws IOException{
        super(text);
            this.setText(text);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

}
