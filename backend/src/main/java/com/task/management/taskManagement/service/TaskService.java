package com.task.management.taskManagement.service;

import java.util.List;

import com.task.management.taskManagement.model.Task;

public interface TaskService {
	void upsertTask(Task task);
	Task getTaskById(String id);
	List<Task> getTasksByUserId(String userId);
	void deleteTaskById(String id);
	void upsertTask(String taskId, Task task);
}
