package com.czy.domain;

import java.util.List;

public class Record {
    private Integer userId;
    private Integer jobId;
    private String jobName;
    private String jobAddress;
    private String companyName;
    private String deliveryTime;
    private String evaluationTime;
    private String interviewTime;
    private String stopTime;
    private String offerTime;

    public Record() {
    }

    public Record(Integer userId, Integer jobId, String jobName, String jobAddress, String companyName, String deliveryTime, String evaluationTime, String interviewTime, String stopTime, String offerTime) {
        this.userId = userId;
        this.jobId = jobId;
        this.jobName = jobName;
        this.jobAddress = jobAddress;
        this.companyName = companyName;
        this.deliveryTime = deliveryTime;
        this.evaluationTime = evaluationTime;
        this.interviewTime = interviewTime;
        this.stopTime = stopTime;
        this.offerTime = offerTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getEvaluationTime() {
        return evaluationTime;
    }

    public void setEvaluationTime(String evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    public String getInterviewTime() {
        return interviewTime;
    }

    public void setInterviewTime(String interviewTime) {
        this.interviewTime = interviewTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public String getOfferTime() {
        return offerTime;
    }

    public void setOfferTime(String offerTime) {
        this.offerTime = offerTime;
    }

    @Override
    public String toString() {
        return "record{" +
                "userId=" + userId +
                ", jobId=" + jobId +
                ", jobName='" + jobName + '\'' +
                ", jobAddress='" + jobAddress + '\'' +
                ", companyName='" + companyName + '\'' +
                ", deliveryTime='" + deliveryTime + '\'' +
                ", evaluationTime='" + evaluationTime + '\'' +
                ", interviewTime='" + interviewTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                ", offerTime='" + offerTime + '\'' +
                '}';
    }
}
