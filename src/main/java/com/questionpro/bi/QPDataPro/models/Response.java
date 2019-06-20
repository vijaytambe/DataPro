package com.questionpro.bi.QPDataPro.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class Response {
    @Id
    private ObjectId _id;

    private Long responseID;

    private Long surveyID;
    private String ipAddress;

    private String timestamp;
    private Location location;
    private Long UTCTimestamp;

    private Boolean duplicate;

    private Long timeTaken;

    private String responseStatus;
    private String completionUrl;
    private String externalReference;
    private Float weight;
    private Map<String, String> customVariables;
    private String emailAddress;

    private String language;

    private String currentInset;

    private String operatingSystem;
    private String osDeviceType;
    private String browser;

    //for request
    private Integer status;
    private Long languageID;
    private String userAgentInfo;

    private List<SurveyResponseValueBean> responseSet;

    public String getCurrentInset() {
        return currentInset;
    }

    public void setCurrentInset(String currentInset) {
        this.currentInset = currentInset;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public Map<String, String> getCustomVariables() {
        if (customVariables == null) {
            customVariables = new LinkedHashMap<>();
        }
        return customVariables;
    }


    public Long getUTCTimestamp() {
        return UTCTimestamp;
    }

    public void setUTCTimestamp(Long UTCTimestamp) {
        this.UTCTimestamp = UTCTimestamp;
    }

    public void setCustomVariables(Map<String, String> customVariables) {
        this.customVariables = customVariables;
    }

    public Boolean getDuplicate() {
        return duplicate;
    }

    public void setDuplicate(Boolean duplicate) {
        this.duplicate = duplicate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public void setExternalReference(String externalReference) {
        this.externalReference = externalReference;
    }

    public Long getResponseID() {
        return responseID;
    }

    public void setResponseID(Long responseID) {
        this.responseID = responseID;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOsDeviceType() {
        return osDeviceType;
    }

    public void setOsDeviceType(String osDeviceType) {
        this.osDeviceType = osDeviceType;
    }

    public List<SurveyResponseValueBean> getResponseSet() {
        if (responseSet == null) {
            responseSet = new ArrayList<>();
        }
        return responseSet;
    }

    public void setResponseSet(List<SurveyResponseValueBean> responseSet) {
        this.responseSet = responseSet;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Long getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(Long surveyID) {
        this.surveyID = surveyID;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public Long getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(Long timeTaken) {
        this.timeTaken = timeTaken;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getCompletionUrl() {
        return completionUrl;
    }

    public void setCompletionUrl(String completionUrl) {
        this.completionUrl = completionUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getLanguageID() {
        return languageID;
    }

    public void setLanguageID(Long languageID) {
        this.languageID = languageID;
    }

    public Location getLocation() {
        if (location == null) {
            location = new Location();
        }
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getUserAgentInfo() {
        return userAgentInfo;
    }

    public void setUserAgentInfo(String userAgentInfo) {
        this.userAgentInfo = userAgentInfo;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }
}
