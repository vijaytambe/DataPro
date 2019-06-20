package com.questionpro.bi.QPDataPro.models;

import java.sql.Timestamp;

public class GetSurveyResponsesRequest {
    private Long surveyID;
    private Integer resultMode;
    private Timestamp startDate;
    private Timestamp endDate;

    public GetSurveyResponsesRequest() {
    }

    public GetSurveyResponsesRequest(Long surveyID) {
        this.surveyID = surveyID;
    }

    public Long getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(Long surveyID) {
        this.surveyID = surveyID;
    }

    public Integer getResultMode() {
        return resultMode;
    }

    public void setResultMode(Integer resultMode) {
        this.resultMode = resultMode;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }
}
