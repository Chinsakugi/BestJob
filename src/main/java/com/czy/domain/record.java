package com.czy.domain;

import java.util.List;

public class record {
    private Integer id;
    private String jobName;
    private String jobAddress;
    private String companyName;
    private String event;
    private String processTime;

    public record() {
    }

    public record(Integer id, String jobName, String jobAddress, String companyName, String event, String processTime) {
        this.id = id;
        this.jobName = jobName;
        this.jobAddress = jobAddress;
        this.companyName = companyName;
        this.event = event;
        this.processTime = processTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getProcessTime() {
        return processTime;
    }

    public void setProcessTime(String processTime) {
        this.processTime = processTime;
    }

    @Override
    public String toString() {
        return "record{" +
                "id=" + id +
                ", jobName='" + jobName + '\'' +
                ", jobAddress='" + jobAddress + '\'' +
                ", companyName='" + companyName + '\'' +
                ", event='" + event + '\'' +
                ", processTime='" + processTime + '\'' +
                '}';
    }
}
