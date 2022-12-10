package com.example.LibraryApp_Backend.dao;

import com.example.LibraryApp_Backend.model.Library;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibraryDao extends CrudRepository<Library,Integer> {
    @Query(value = "SELECT `id`, `author`, `description`, `distributor`, `image`, `language`, `price`, `publisher`, `releaseyear`, `title` FROM `book_add` WHERE `title` LIKE  %:title%",nativeQuery = true)
    List<Library> BookSearch(@Param("title")String title);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `book_add` WHERE `id`= :id",nativeQuery = true)
    void BookDelete(@Param("id") Integer id);
}
