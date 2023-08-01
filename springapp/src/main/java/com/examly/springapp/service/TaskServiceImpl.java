package com.examly.springapp.service;

import com.examly.springapp.model.Task;
import com.examly.springapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository taskRepository;

    @Override
    public String addTasks(Task task) {
        this.taskRepository.save(task);
        return "Task added successfully";
    }

    @Override
    public Task getTaskById(String taskId) {
        return this.taskRepository.findById(taskId)
                .orElseThrow(()-> new RuntimeException("taskId not found"));
    }

    @Override
    public String deleteTaskById(String id) {
        this.taskRepository.deleteById(id);
        return "Task deleted successfully";
    }

    @Override
    public List<TaskDto> getAllTasks() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task getTaskByName(String id) {
        return this.taskRepository.getTaskByName(id);
    }
}

