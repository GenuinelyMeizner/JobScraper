package com.jobscraper.scrape.RestController;

import com.jobscraper.scrape.Models.Job;
import com.jobscraper.scrape.Repository.IJobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobRestController
{
    @Autowired
    IJobRepository jobRepository;

    @GetMapping("/findAll")
    public List<Job> findAll()
    {
        return jobRepository.findAll();
    }
}
