package com.example.demo.config;

import com.example.demo.service.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class WebController {
    private JobService jobService;

    public WebController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping(path = "/")
    public String home(Model model) {

        model.addAttribute("jobs",jobService.listJob());
        return "home";
    }

    @PostMapping(path = "/")

}
