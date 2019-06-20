package com.questionpro.bi.QPDataPro.models;

public class AnswerResponseValueBean {
    private String scale;
    private String other;
    private String dynamicExplodeText;
    private String text;
    private String result;
    private String fileLink;
    private Double rank;
    private Long clientUTC;
    private String binaryData;
    private String date;
    private String storeLocator;
    private Float weight;

    public AnswerResponseValueBean() {
    }

    public String getDynamicExplodeText() {
        return dynamicExplodeText;
    }

    public void setDynamicExplodeText(String dynamicExplodeText) {
        this.dynamicExplodeText = dynamicExplodeText;
    }

    public String getFileLink() {
        return fileLink;
    }

    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getBinaryData() {
        return binaryData;
    }

    public void setBinaryData(String binaryData) {
        this.binaryData = binaryData;
    }

    public Long getClientUTC() {
        return clientUTC;
    }

    public void setClientUTC(Long clientUTC) {
        this.clientUTC = clientUTC;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getRank() {
        return rank;
    }

    public void setRank(Double rank) {
        this.rank = rank;
    }

    public String getStoreLocator() {
        return storeLocator;
    }

    public void setStoreLocator(String storeLocator) {
        this.storeLocator = storeLocator;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }
}
