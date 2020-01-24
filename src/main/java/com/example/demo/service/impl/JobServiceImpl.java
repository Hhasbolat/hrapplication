package com.example.demo.service.impl;

import com.example.demo.error.OrderNotFoundException;
import com.example.demo.model.JobListing;
import com.example.demo.model.dto.JobListingDto;
import com.example.demo.repo.JobRepository;
import com.example.demo.service.JobService;
import com.example.demo.service.converter.JobConverter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public JobListingDto addJob(JobListingDto job)   {
        JobListing user = JobConverter.converter(job);
        JobListing save = jobRepository.save(user);
        JobListingDto userDto = JobConverter.converter(save);
        return userDto;
    }

    @Override
    public List<JobListingDto> listJob() {
        List<JobListing> jobListingList = jobRepository.findAll();
        List<JobListingDto> dtoList = JobConverter.converter(jobListingList);

        return dtoList;
    }

    @Override
    public void deleteJob(Integer id) {
        jobRepository.deleteById(id);
    }

}
