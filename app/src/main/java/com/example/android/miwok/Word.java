package com.example.android.miwok;

import android.content.Context;
import android.view.View;

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Image for the word */
    private int mImageResourceId = -1;

    /** Sound resource ID for the word */
    private int mSoundResourceId;

    /** Constant value that represents no image was provided for this word */
    //private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     *  defaultTranslation is the word in a language that the user is already familiar with (such as English)
     *  miwokTranslation is the word in the Miwok language
     * @param soundResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param soundResourceId is the resource ID for the audio file associated with this word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the image of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public Boolean hasImage() {
        return mImageResourceId != -1;
    }

    /**
     * Return the sound resource ID of the word.
     */
    public int getSoundResourceId() {
        return mSoundResourceId;
    }

    /**
     * Returns the string representation of the {@link Word} object.
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mSoundResourceId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
