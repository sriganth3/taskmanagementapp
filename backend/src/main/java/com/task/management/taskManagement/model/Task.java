package com.task.management.taskManagement.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
public abstract class Task {

	@Id
	private String id;
	private String name;
	private String description;
	private Status status;
	private Date createdTime;
	private Date updatedTime;

	public Task() {}

	public Task(String id, String name, String description, Status status, Date createdTime, Date updatedTime) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.status = status;
		this.createdTime = createdTime;
		this.updatedTime = updatedTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
}
