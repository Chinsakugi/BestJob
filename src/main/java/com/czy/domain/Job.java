package com.czy.domain;

public class Job {
    private Integer id;
    private String companyName;
    private String jobName;
    private String jobInfo;
    private String jobAddress;
    private String salary;
    private String jobDescription;
    private String jobCategory;
    private String jobRequire;
    private String postTime;

    public Job() {
    }

    public Job(Integer id, String companyName, String jobName, String jobInfo, String jobAddress, String salary, String jobDescription, String jobCategory, String jobRequire, String postTime) {
        this.id = id;
        this.companyName = companyName;
        this.jobName = jobName;
        this.jobInfo = jobInfo;
        this.jobAddress = jobAddress;
        this.salary = salary;
        this.jobDescription = jobDescription;
        this.jobCategory = jobCategory;
        this.jobRequire = jobRequire;
        this.postTime = postTime;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(String jobInfo) {
        this.jobInfo = jobInfo;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getJobRequire() {
        return jobRequire;
    }

    public void setJobRequire(String jobRequire) {
        this.jobRequire = jobRequire;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", jobName='" + jobName + '\'' +
                ", jobInfo='" + jobInfo + '\'' +
                ", jobAddress='" + jobAddress + '\'' +
                ", salary='" + salary + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", jobCategory='" + jobCategory + '\'' +
                ", jobRequire='" + jobRequire + '\'' +
                ", postTime='" + postTime + '\'' +
                '}';
    }
}
