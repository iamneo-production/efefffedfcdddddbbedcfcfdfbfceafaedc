package com.examly.springapp.controller;

import com.examly.springapp.model.Task;
import com.examly.springapp.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/saveTask")
    public String addTasks(@RequestBody Task task){
        return this.taskService.addTasks(task);
    }

    @GetMapping("/getTask")
    public Task getTaskById(@RequestParam String taskId){
        return this.taskService.getTaskById(taskId);
    }

    @GetMapping("/deleteTask")
    public void deleteTaskById(@RequestParam String taskId){
         this.taskService.deleteTaskById(taskId);
    }

    @GetMapping("/alltasks")
    public List<Task> getAllTasks(){
        return this.taskService.getAllTasks();
    }

    @GetMapping("/changeStatus")
    public Task getTaskByName(@RequestParam String taskId){
        return this.taskService.getTaskByName(taskId);
    }

}

