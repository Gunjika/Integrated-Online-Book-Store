package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BookDetails;

public interface BookDetailsDao extends JpaRepository<BookDetails, Integer>{

}
