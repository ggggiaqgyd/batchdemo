package com.icbc.product.batch.service;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstTestImpl implements IFirstTest {
    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job importJob;

    public JobParameters jobParameters;
    @Override
    public String imp(String fileName) throws Exception{

        String path = fileName+".txt";
        jobParameters = new JobParametersBuilder()
                .addLong("time", 100l)
                .addString("input.file.name", path)
                .toJobParameters();
        jobLauncher.run(importJob,jobParameters);
        return "ok";
    }
}
