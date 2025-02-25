package com.arindam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arindam.model.Job;
import com.arindam.service.JobService;

@SpringBootApplication
public class BootDataJpaApplication implements CommandLineRunner {
	@Autowired
private JobService jservice;
	public static void main(String[] args) {
		SpringApplication.run(BootDataJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Job j=new Job("J2","DOTNET","TCS");
		//jservice.addData(j);
		//jservice.deleteData("J2");
		//List<Job> jlist=jservice.getData();
		//jlist.stream().forEach(System.out::println);
		//Job jb=jservice.getJobIdDetails("J1");
		//System.out.println(jb);
		Job jb=jservice.updateData("J1");
		System.out.println(jb);
	}

}
