package com.log.Analysis.config;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.log.Analysis.document.TestResult;
import com.log.Analysis.repository.LogRepository;
import com.mongodb.MongoClient;

@EnableMongoRepositories(basePackageClasses = LogRepository.class)
@Configuration
public class MongoDBConfig {
	/*@Bean
	CommandLineRunner commandLineRunner(LogRepository logRepository){
		return strings -> {logRepository.save(new TestResult(1, 1, "name1", "pass", new Date()));};
	}*/
}
