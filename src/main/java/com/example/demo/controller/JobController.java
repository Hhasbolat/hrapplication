package com.example.demo.controller;

import com.example.demo.model.dto.JobListingDto;
import com.example.demo.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/job")
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping
    public JobListingDto addJob (@RequestBody JobListingDto jobListingDto){
        return jobService.addJob(jobListingDto);
    }

    @GetMapping
    public List<JobListingDto> listJob(){
        return jobService.listJob();
    }

}
