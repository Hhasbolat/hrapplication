package com.example.demo.model.dto;


public class JobListingDto {

    private Integer id;
    private String jobTitle;
    private String jobDescription;
    private String numberHire;
    private String lastApplicationDate;

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getNumberHire() {
        return numberHire;
    }

    public void setNumberHire(String numberHire) {
        this.numberHire = numberHire;
    }

    public String getLastApplicationDate() {
        return lastApplicationDate;
    }

    public void setLastApplicationDate(String lastApplicationDate) {
        this.lastApplicationDate = lastApplicationDate;
    }
}
