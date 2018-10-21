package com.example.android.newsapp;

import android.os.Parcel;
import android.os.Parcelable;


public class Word implements Parcelable {

    private String mSection;
    private String mTitle;
    private String mWebPublicationDate;
    private String mUrl;

    public Word(String mAuthor, String mTitle, String mUrl,String mWebPublicationDate) {
        this.mSection = mAuthor;
        this.mTitle = mTitle;
        this.mUrl = mUrl;
        this.mWebPublicationDate = mWebPublicationDate;
    }


    protected Word(Parcel in) {
        mSection = in.readString();
        mTitle = in.readString();
        mUrl = in.readString();
        mWebPublicationDate = in.readString();
    }

    public static final Creator<Word> CREATOR = new Creator<Word>() {
        @Override
        public Word createFromParcel(Parcel in) {
            return new Word(in);
        }

        @Override
        public Word[] newArray(int size) {
            return new Word[size];
        }
    };

    public String getmAuthor() {
        return mSection;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmUrl() {
        return mUrl;
    }
    public String getmWebPublicationDate() {
        return mWebPublicationDate;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mSection);
        dest.writeString(mTitle);
        dest.writeString(mUrl);
        dest.writeString(mWebPublicationDate);
    }
}