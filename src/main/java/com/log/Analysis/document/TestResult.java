package com.log.Analysis.document;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TestResult {

	@Id
	private Integer testId;
	private Integer operationId;
	private String testName;
	private String result;
	private Date timestamp;
	
	public TestResult(Integer testId, Integer operationId, String testName, String result, Date timestamp) {
		super();
		this.testId = testId;
		this.operationId = operationId;
		this.testName = testName;
		this.result = result;
		this.timestamp = timestamp;
	}

	public Integer getTestId() {
		return testId;
	}

	public void setTestId(Integer testId) {
		this.testId = testId;
	}

	public Integer getOperationId() {
		return operationId;
	}

	public void setOperationId(Integer operationId) {
		this.operationId = operationId;
	}

	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
}
