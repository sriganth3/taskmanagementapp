package com.task.management.taskManagement.model;

import java.util.Date;

public class SimpleTask extends Task{

	private String assignedTo;

	public SimpleTask() {
		super();
	}

	public SimpleTask(String id, String name, String description, Status status, Date createdTime, Date updatedTime, String assignedTo) {
		super(id, name, description, status, createdTime, updatedTime);
		this.assignedTo = assignedTo;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

}