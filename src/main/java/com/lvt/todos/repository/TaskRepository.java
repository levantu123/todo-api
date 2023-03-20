package com.lvt.todos.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lvt.todos.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
	Page<Task> findByOwnerId(Long ownerId, Pageable pageable);
	Page<Task> findByTopicId(Long topicId, Pageable pageable);
}
