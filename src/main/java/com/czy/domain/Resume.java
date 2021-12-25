package com.czy.domain;

public class Resume {
    private Integer id;
    private Integer userId;
    private String realName;
    private String phone;
    private String email;
    private String birthday;
    private String gender;
    private String universityName;
    private String major;
    private String degree;
    private String projectName;
    private String projectTitle;
    private String projectDescription;
    private String awardInfo;
    private String selfEvaluation;

    public Resume() {
    }

    public Resume(Integer id, Integer userId, String realName, String phone, String email, String birthday, String gender, String universityName, String major, String degree, String projectName, String projectTitle, String projectDescription, String awardInfo, String selfEvaluation) {
        this.id = id;
        this.userId = userId;
        this.realName = realName;
        this.phone = phone;
        this.email = email;
        this.birthday = birthday;
        this.gender = gender;
        this.universityName = universityName;
        this.major = major;
        this.degree = degree;
        this.projectName = projectName;
        this.projectTitle = projectTitle;
        this.projectDescription = projectDescription;
        this.awardInfo = awardInfo;
        this.selfEvaluation = selfEvaluation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getAwardInfo() {
        return awardInfo;
    }

    public void setAwardInfo(String awardInfo) {
        this.awardInfo = awardInfo;
    }

    public String getSelfEvaluation() {
        return selfEvaluation;
    }

    public void setSelfEvaluation(String selfEvaluation) {
        this.selfEvaluation = selfEvaluation;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", userId=" + userId +
                ", realName='" + realName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", universityName='" + universityName + '\'' +
                ", major='" + major + '\'' +
                ", degree='" + degree + '\'' +
                ", projectName='" + projectName + '\'' +
                ", projectTitle='" + projectTitle + '\'' +
                ", projectDescription='" + projectDescription + '\'' +
                ", awardInfo='" + awardInfo + '\'' +
                ", selfEvaluation='" + selfEvaluation + '\'' +
                '}';
    }
}
