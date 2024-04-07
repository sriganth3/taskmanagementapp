package com.task.management.taskManagement.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.task.management.taskManagement.model.Task;

@Repository
public class TaskRepositoryImpl implements TaskRepository{

	private final MongoTemplate mongoTemplate;

	@Autowired
	public TaskRepositoryImpl(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public Task findById(String id) {
		Query query = new Query(Criteria.where("_id").is(id));
		return mongoTemplate.findOne(query, Task.class); 
	}

	@Override
	public List<Task> findByUserId(String userId) {
		Query query = new Query(Criteria.where("userId").is(userId));
		return mongoTemplate.find(query, Task.class); 
	}

	@Override
	public void deleteById(String id) {
		Query query = new Query(Criteria.where("_id").is(id));
		mongoTemplate.remove(query, Task.class); 
	}

	@Override
	public Task upsert(Task task) {
		mongoTemplate.save(task);
		return task;
	}
}


