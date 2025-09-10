package com.example.springkadaitodo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springkadaitodo.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	
	List<User>findByUserName(String userName);

}
