package com.iprimed.voizfonica.service;

import java.util.List;

import javax.transaction.Transactional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.iprimed.voizfonica.model.User;

import com.iprimed.voizfonica.repository.UserRepository;
 
@Service
@Transactional
public class UserServices {
     
    @Autowired
    private UserRepository repo;
     
    public User findByEmail(String s) {
        return repo.findByEmail(s);
    }
    
     
}
