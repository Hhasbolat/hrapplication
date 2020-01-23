package com.example.demo.config;

import com.example.demo.model.dto.JobListingDto;
import com.example.demo.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


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
    @GetMapping(path = "/")
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
    public String saveBooks(@ModelAttribute JobListingDto form, Model model) {
        jobService.addJob(form);
        model.addAttribute("books", jobService.listJob());

        return "redirect:/";
    }
}
