package com.log.Analysis.resource;

import java.util.HashMap;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.log.Analysis.repository.LogRepository;

@CrossOrigin
@RestController
public class LogResource {
	private LogRepository logRepository;
	@Autowired
	private MongoTemplate mongoTemplate;

	public LogResource(LogRepository logRepository) {
		super();
		this.logRepository = logRepository;
	}
	
	@GetMapping("/employees")
	public List<Document> getAll(){
		return mongoTemplate.findAll(Document.class,"employee");
	}
	
	@GetMapping("/employees/count/dept")
	public HashMap<String,Integer> getCount(){
		List<Document> list = mongoTemplate.findAll(Document.class,"employee");
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(Document d:list){
			map.put(d.getString("Department"), map.getOrDefault(d.getString("Department"), 0)+1);
		}
		return map;
	}
	
	@PostMapping("/employees")
	public ResponseEntity<?> addData(@RequestBody List<Document> docs){
		System.out.println(docs);
		for(Document d:docs)
			mongoTemplate.insert(d,"employee");
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
