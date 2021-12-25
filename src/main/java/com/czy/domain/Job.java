package com.czy.domain;

public class Job {
    private Integer id;
    private Integer companyId;
    private String jobName;
    private String jobInfo;
    private String jobAddress;
    private String salary;
    private String jobDescription;
    private String jobCategory;
    private String jobRequire;

    public Job() {
    }

    public Job(Integer id, Integer companyId, String jobName, String jobInfo, String jobAddress, String salary, String jobDescription, String jobCategory, String jobRequire) {
        this.id = id;
        this.companyId = companyId;
        this.jobName = jobName;
        this.jobInfo = jobInfo;
        this.jobAddress = jobAddress;
        this.salary = salary;
        this.jobDescription = jobDescription;
        this.jobCategory = jobCategory;
        this.jobRequire = jobRequire;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
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
                ", companyId=" + companyId +
                ", jobName='" + jobName + '\'' +
                ", jobInfo='" + jobInfo + '\'' +
                ", jobAddress='" + jobAddress + '\'' +
                ", salary='" + salary + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", jobCategory='" + jobCategory + '\'' +
                ", jobRequire='" + jobRequire + '\'' +
                '}';
    }
}
