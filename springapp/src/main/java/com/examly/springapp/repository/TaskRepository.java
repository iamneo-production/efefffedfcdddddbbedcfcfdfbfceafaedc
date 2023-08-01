package com.examly.springapp.repository;

import com.examly.springapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TaskRepository extends JpaRepository<Task,String> {

    @Query(value = "select *from task where task_holder_name=:id",nativeQuery = true)
    Task getTaskByName(@Param("id") String id);
}

