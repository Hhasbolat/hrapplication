package com.example.demo.repo;

import com.example.demo.model.JobListing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<JobListing,Integer> {

}
