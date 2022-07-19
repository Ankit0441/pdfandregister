package com.iprimed.voizfonica.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iprimed.voizfonica.model.User;


 
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail(String s);
     
}