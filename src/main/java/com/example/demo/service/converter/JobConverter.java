package com.example.demo.service.converter;

import com.example.demo.model.JobListing;
import com.example.demo.model.dto.JobListingDto;

import java.util.ArrayList;
import java.util.List;

public class JobConverter {

    public static JobListingDto converter(JobListing jobListing){
        JobListingDto jobListingDto = new JobListingDto();

        jobListingDto.setDescription(jobListing.getDescription());
        jobListingDto.setTitle(jobListing.getTitle());
        jobListingDto.setLastApplicationDate(jobListing.getLastApplicationDate());
        jobListingDto.setNumberHire(jobListing.getNumberHire());

        return jobListingDto;
    }

    public static JobListing converter(JobListingDto jobListingDto){
        JobListing jobListing = new JobListing();

        jobListing.setDescription(jobListingDto.getDescription());
        jobListing.setLastApplicationDate(jobListingDto.getLastApplicationDate());
        jobListing.setTitle(jobListingDto.getTitle());
        jobListing.setNumberHire(jobListingDto.getNumberHire());

        return jobListing;
    }

    public static List<JobListingDto> converter(List<JobListing> jobListing){
        List<JobListingDto> jobListingDtoList = new ArrayList<>();

        for (JobListing job : jobListing){
            JobListingDto jobListingDto = new JobListingDto();

            jobListingDto.setId(job.getId());
            jobListingDto.setNumberHire(job.getNumberHire());
            jobListingDto.setLastApplicationDate(job.getLastApplicationDate());
            jobListingDto.setTitle(job.getTitle());
            jobListingDto.setDescription(job.getDescription());

            jobListingDtoList.add(jobListingDto);
        }
        return jobListingDtoList;
    }

}
