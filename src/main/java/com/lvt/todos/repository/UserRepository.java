package com.lvt.todos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lvt.todos.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
