package com.Harshit.control;

import com.Harshit.model.Task;
import com.Harshit.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskControl {
    @Autowired
    private TaskService service;
    @PostMapping
    public Task createTask(@RequestBody Task task){
        return  service.addTask(task);
    }

    @GetMapping
    public List<Task> getTasks(){
        return service.findAllTask();
    }

   @GetMapping("/{id}")
    public Task getTask(@PathVariable String id){
        return service.getTaskById(id);

    }

    @GetMapping("/name/{name}")
    public List<Task> getTaskUsingName(@PathVariable String name){
        return service.getTaskByName(name);
    }

   @DeleteMapping("/ {id}")
    public String deleteTasks(@PathVariable String id){
        return service.deleteTask(id);
    }

}