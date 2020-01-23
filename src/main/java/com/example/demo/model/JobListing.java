package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "job_listing")
public class JobListing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String numberHire;

    @Column
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

    public void setTitle(String jobTitle) {
        this.title = jobTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String jobDescription) {
        this.description = jobDescription;
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
