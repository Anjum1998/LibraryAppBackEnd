package com.example.LibraryApp_Backend.dao;

import com.example.LibraryApp_Backend.Controller.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {
}
