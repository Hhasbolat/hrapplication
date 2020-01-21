package com.example.demo.service;

import com.example.demo.model.dto.JobListingDto;

import java.util.List;

public interface JobService {

     JobListingDto addJob(JobListingDto job);

     List<JobListingDto> listJob();

}
