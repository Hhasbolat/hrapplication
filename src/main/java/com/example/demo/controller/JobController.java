package com.example.demo.controller;

import com.example.demo.model.dto.JobListingDto;
import com.example.demo.service.JobService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(path = "/home")
public class JobController {

    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/addJob")
    public JobListingDto addJob (@RequestBody JobListingDto jobListingDto){
        return jobService.addJob(jobListingDto);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/listJob")
    public List<JobListingDto> listJob(){
        return jobService.listJob();
    }

}
