package com.task.management.taskManagement.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.task.management.taskManagement.model.Task;

public interface TaskRepository {
	Task findById(String id);
	List<Task> findByUserId(String userId);
	void deleteById(String id);
	Task upsert(Task task);
}
