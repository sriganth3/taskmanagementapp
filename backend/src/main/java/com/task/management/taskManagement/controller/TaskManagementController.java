package com.task.management.taskManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.task.management.taskManagement.model.Task;
import com.task.management.taskManagement.service.TaskService;

@RestController
@RequestMapping("/api/tasks")
public class TaskManagementController {

	@Autowired
	private TaskService taskService;

	@PostMapping
	public ResponseEntity<?> createTask(@RequestBody Task task) {
		taskService.upsertTask(task);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@GetMapping("/{taskId}")
	public ResponseEntity<Task> getTaskById(@PathVariable String taskId) {
		Task task = taskService.getTaskById(taskId);
		return ResponseEntity.ok(task);
	}

	@PutMapping("/{taskId}") //Keeping seperate API for updating tasks to be open for extension even though we have similar implementation
	public ResponseEntity<?> updateTask(@PathVariable String taskId, @RequestBody Task task) {
		taskService.upsertTask(taskId, task);
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("/{taskId}")
	public ResponseEntity<?> deleteTask(@PathVariable String taskId) {
		taskService.deleteTaskById(taskId);
		return ResponseEntity.ok().build();
	}

}

