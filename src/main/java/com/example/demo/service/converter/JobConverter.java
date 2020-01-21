package com.example.demo.service.converter;

import com.example.demo.model.JobListing;
import com.example.demo.model.dto.JobListingDto;

import java.util.ArrayList;
import java.util.List;

public class JobConverter {

    public static JobListingDto converter(JobListing jobListing){
        JobListingDto jobListingDto = new JobListingDto();

        jobListingDto.setJobDescription(jobListing.getJobDescription());
        jobListingDto.setJobTitle(jobListing.getJobTitle());
        jobListingDto.setLastApplicationDate(jobListing.getLastApplicationDate());
        jobListingDto.setNumberHire(jobListing.getNumberHire());

        return jobListingDto;
    }

    public static JobListing converter(JobListingDto jobListingDto){
        JobListing jobListing = new JobListing();
        jobListing.setJobDescription(jobListingDto.getJobDescription());
        jobListing.setLastApplicationDate(jobListingDto.getLastApplicationDate());
        jobListing.setJobTitle(jobListingDto.getJobTitle());
        jobListing.setNumberHire(jobListingDto.getNumberHire());

        return jobListing;
    }

    public static List<JobListingDto> converter(List<JobListing> jobListing){
        List<JobListingDto> jobListingDtoList = new ArrayList<>();

        for (JobListing jobs : jobListing){
            JobListingDto jobListingDto = new JobListingDto();

            jobListingDto.setNumberHire(jobs.getNumberHire());
            jobListingDto.setLastApplicationDate(jobs.getLastApplicationDate());
            jobListingDto.setJobTitle(jobs.getJobTitle());
            jobListingDto.setJobDescription(jobs.getJobDescription());

            jobListingDtoList.add(jobListingDto);
        }
        return jobListingDtoList;
    }

}
