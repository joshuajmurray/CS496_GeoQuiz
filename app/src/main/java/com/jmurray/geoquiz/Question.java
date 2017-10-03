package com.jmurray.geoquiz;

import java.io.Serializable;

/**
 * Created by Joshua on 9/24/2017.
 */

public class Question implements Serializable{
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mCheated;

    public Question(int textResId, boolean answerTrue, boolean cheatTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mCheated = cheatTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isCheater() {return mCheated;}

    public void  setCheater(boolean cheated) {
        mCheated = cheated;
    }
}
