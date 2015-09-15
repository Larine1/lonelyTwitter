package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;

import org.xml.sax.DTDHandler;

import java.io.IOException;
import java.util.Date;

/**
 * Created by qingdai on 9/14/15.
 */
public class theThirdClass extends theFirstClass {
    public theThirdClass(mood,date) throws IOException{
    super(date);
    }

    public String getText() {
        return mood;
    }

    public Date getDate() {
        return date;
    }

    public void setText(String differentmood2) {
        this.mood = differentmood2;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
