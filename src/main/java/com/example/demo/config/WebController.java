package com.example.demo.config;

import com.example.demo.model.dto.JobListingDto;
import com.example.demo.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.InvocationTargetException;


@Controller
public class WebController {
    private JobService jobService;

    public WebController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping(path = "/home")
    public String home() {

        return "home";
    }
    @GetMapping(path = "/listJob")
    public String list(Model model) {
        model.addAttribute("jobs",jobService.listJob());

        return "allJobs";
    }

    @GetMapping(path = "/create")
    public String create(Model model){
        model.addAttribute("job", new JobListingDto());

        return "createJobsForm";
    }

    @PostMapping("/save")
    public String saveBooks(@ModelAttribute JobListingDto jobListingDto, Model model){
        jobService.addJob(jobListingDto);
        model.addAttribute("books", jobService.listJob());

        return "redirect:/home";
    }
    @RequestMapping("/api/jobs/{id}")
    public String listing(@PathVariable Integer id){
        jobService.deleteJob(id);
        return "redirect:/listJob";
    }
}
