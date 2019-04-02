package com.log.Analysis.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fasterxml.jackson.databind.JsonNode;

public interface LogRepository extends MongoRepository<JsonNode,Integer> {

}