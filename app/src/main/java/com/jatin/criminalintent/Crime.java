package com.jatin.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by jatin.prajapati on 11/11/2016.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public String getSuspect() {
        return mSuspect;
    }

    public void setSuspect(String suspect) {
        mSuspect = suspect;
    }

    private String mSuspect;

    private boolean mIsModified;

    public UUID getId() {
        return mId;
    }

    public void setId(UUID id) {
        mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
        mIsModified = true;
    }

    public Crime(){
        //Generate unique identifier
        mId = UUID.randomUUID();
        setDate(new Date());
    }

    public Crime(UUID id){
        mId = id;
        mDate = new Date();
    }

    public boolean isModified() {
        return mIsModified;
    }

    public void setModified(boolean modified) {
        mIsModified = modified;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
        mIsModified = true;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
        mIsModified = true;
    }

    public String getPhotoFilename(){
        return "IMG_" + getId().toString() + ".jpg";
    }
}
