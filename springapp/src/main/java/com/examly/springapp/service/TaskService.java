package com.examly.springapp.service;

import com.examly.springapp.model.Task;

import java.util.List;

public interface TaskService {

    String addTasks(Task task);

    Task getTaskById(String taskId);

    String deleteTaskById(String id);

    List<TaskDto> getAllTasks();

    Task getTaskByName(String id);
}

