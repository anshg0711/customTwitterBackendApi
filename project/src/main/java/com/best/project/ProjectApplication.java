package com.best.project;

import com.best.project.TwitterApi.TwitterApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectApplication {
	public static void main(String[] args) {

		SpringApplication.run(ProjectApplication.class, args);
//		TwitterApi.fetchDataAndSaveToMongoDB();
	}

}
