package com.questionpro.bi.QPDataPro.models;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angad on 12/27/17.
 */
public class SurveyResponseValueBean {
    private Long questionID;
    private String questionDescription;
    private String questionCode;
    private String questionText;
    private String imageUrl;
    private List<AnswerResponseBean> answerValues;

    public String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
    }

    public Long getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Long questionID) {
        this.questionID = questionID;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<AnswerResponseBean> getAnswerValues() {
        if (answerValues == null) {
            answerValues = new ArrayList<>();
        }
        return answerValues;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
