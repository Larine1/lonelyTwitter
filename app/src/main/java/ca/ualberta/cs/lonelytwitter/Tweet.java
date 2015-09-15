package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;
import java.util.Date;
import java.util.IllegalFormatCodePointException;

/**
 * Created by qingdai on 9/14/15.
 *
 * dont allow someone to go to tweet.text = ""
 * we want to force them to call methods instead)
 */

//methods attributes written as camelCase
//classes written by CamelCase


//    Object is a class since it is upperclass
public abstract class Tweet{
    //private protected - public
    protected  String text;
    private Date date;
//    private String enExtractToXX();
//    private static Integer somthing;

    public Tweet(String tweet, Date date) {
        text = tweet; //text refers to the text above /by using this.something, if it have a same name with a global variable.
        this.date = date;//*iheritant
    }

    public Tweet(String text) {
//        this(text, new Date());
        this.text = text;
        date = new Date();

    }

    public void setText(String text) throws IOException{
        if (text.length() <= 140) {
            this.text = text;
        } else{
            throw new IOException("Tweet was too long");}
    }

    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }
//    x.y in java is basically x->y in C pass by reference (change original value)


    public abstract Boolean isImportant();
}
