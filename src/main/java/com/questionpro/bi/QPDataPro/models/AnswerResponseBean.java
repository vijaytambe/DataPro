package com.questionpro.bi.QPDataPro.models;


public class AnswerResponseBean {
    private Long answerID;
    private String answerText;
    private AnswerResponseValueBean value;

    public AnswerResponseBean() {
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public Long getAnswerID() {
        return answerID;
    }

    public void setAnswerID(Long answerID) {
        this.answerID = answerID;
    }

    public AnswerResponseValueBean getValue() {
        if (value == null) {
            value = new AnswerResponseValueBean();
        }
        return value;
    }

    public void setValue(AnswerResponseValueBean value) {
        this.value = value;
    }
}

