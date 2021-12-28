package com.czy.domain;

public class Resume {

    private Integer id;
    private Integer userId;
    private String name;
    private String phone;
    private String email;
    private String card;
    private String loc;
    private String school;
    private String major;
    private String edu_time;
    private String education;
    private String grade;
    private String company;
    private String work_time;
    private String work_position;
    private String work_description;
    private String project;
    private String project_position;
    private String project_time;
    private String project_description;
    private String self_judge;

    public Resume() {
    }

    public Resume(Integer id, Integer userId, String name, String phone, String email, String card, String loc, String school, String major, String edu_time, String education, String grade, String company, String work_time, String work_position, String work_description, String project, String project_position, String project_time, String project_description, String self_judge) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.card = card;
        this.loc = loc;
        this.school = school;
        this.major = major;
        this.edu_time = edu_time;
        this.education = education;
        this.grade = grade;
        this.company = company;
        this.work_time = work_time;
        this.work_position = work_position;
        this.work_description = work_description;
        this.project = project;
        this.project_position = project_position;
        this.project_time = project_time;
        this.project_description = project_description;
        this.self_judge = self_judge;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getEdu_time() {
        return edu_time;
    }

    public void setEdu_time(String edu_time) {
        this.edu_time = edu_time;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWork_time() {
        return work_time;
    }

    public void setWork_time(String work_time) {
        this.work_time = work_time;
    }

    public String getWork_position() {
        return work_position;
    }

    public void setWork_position(String work_position) {
        this.work_position = work_position;
    }

    public String getWork_description() {
        return work_description;
    }

    public void setWork_description(String work_description) {
        this.work_description = work_description;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getProject_position() {
        return project_position;
    }

    public void setProject_position(String project_position) {
        this.project_position = project_position;
    }

    public String getProject_time() {
        return project_time;
    }

    public void setProject_time(String project_time) {
        this.project_time = project_time;
    }

    public String getProject_description() {
        return project_description;
    }

    public void setProject_description(String project_description) {
        this.project_description = project_description;
    }

    public String getSelf_judge() {
        return self_judge;
    }

    public void setSelf_judge(String self_judge) {
        this.self_judge = self_judge;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "id=" + id +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", card='" + card + '\'' +
                ", loc='" + loc + '\'' +
                ", school='" + school + '\'' +
                ", major='" + major + '\'' +
                ", edu_time='" + edu_time + '\'' +
                ", education='" + education + '\'' +
                ", grade='" + grade + '\'' +
                ", company='" + company + '\'' +
                ", work_time='" + work_time + '\'' +
                ", work_position='" + work_position + '\'' +
                ", work_description='" + work_description + '\'' +
                ", project='" + project + '\'' +
                ", project_position='" + project_position + '\'' +
                ", project_time='" + project_time + '\'' +
                ", project_description='" + project_description + '\'' +
                ", self_judge='" + self_judge + '\'' +
                '}';
    }
}
