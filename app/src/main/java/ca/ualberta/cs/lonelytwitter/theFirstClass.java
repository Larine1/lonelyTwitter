package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by qingdai on 9/14/15.
 */
public abstract class theFirstClass {
    private String mood;
    private Date date;

    public theFirstClass(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }
    public theFirstClass(String mood) {
        this.mood = mood;
        date = new Date();
    }

    public String getText() {
        return mood;
    }

    public Date getDate() {
        return date;
    }

    public void setText(String mood) {
        this.mood = mood;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract Boolean isImportant();

}
