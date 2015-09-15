package ca.ualberta.cs.lonelytwitter;


import android.app.Activity;

import java.util.Date;

/**
 * Created by qingdai on 9/14/15.
 */
public class theSecondClass extends theFirstClass{
    private Date date;
    private String mood;

    public theSecondClass(Date date, String mood1) {
        this.date = date;
        this.mood = mood1;
    }

    public Date getDate() {
        return date;
    }

    public String getText() {
        return mood;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setText(String differentmood1) {
        this.mood = differentmood1;
    }
}

