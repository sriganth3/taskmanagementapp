package com.task.management.taskManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.management.taskManagement.data.TaskRepository;
import com.task.management.taskManagement.model.Task;


@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public void upsertTask(Task task) {
		taskRepository.upsert(task);
	}

	@Override
	public Task getTaskById(String id) {
		return taskRepository.findById(id);
	}

	@Override
	public List<Task> getTasksByUserId(String userId) {
		return taskRepository.findByUserId(userId);
	}

	@Override
	public void deleteTaskById(String id) {
		taskRepository.deleteById(id);
	}

	@Override
	public void upsertTask(String taskId, Task task) {
		taskRepository.upsert(task);
	}

}