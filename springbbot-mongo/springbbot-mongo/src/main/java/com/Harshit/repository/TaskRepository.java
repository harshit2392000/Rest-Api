package com.Harshit.repository;

import com.Harshit.model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task,String> {
   @Query("{name: ?0}")
    List<Task> findByName(String name);

}