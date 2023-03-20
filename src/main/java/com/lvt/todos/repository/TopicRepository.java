package com.lvt.todos.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.lvt.todos.models.Task;
import com.lvt.todos.models.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long>{
	Page<Task> findByOwnerId(Long ownerId, Pageable pageable);
}
