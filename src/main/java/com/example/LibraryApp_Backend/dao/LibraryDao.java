package com.example.LibraryApp_Backend.dao;

import com.example.LibraryApp_Backend.Controller.model.Library;
import org.springframework.data.repository.CrudRepository;

public interface LibraryDao extends CrudRepository<Library,Integer> {
}
