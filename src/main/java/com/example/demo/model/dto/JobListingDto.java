package com.example.demo.model.dto;

public class JobListingDto {

    private Integer id;
    private String title;
    private String description;
    private String numberHire;
    private String lastApplicationDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
