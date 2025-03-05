package com.rean.repository;

import com.rean.model.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.awt.print.Pageable;
import java.util.Optional;

public interface CourseRepository  extends JpaRepository<Course,Long> {

    Optional<Course> findFirstById(Long id);

    Page<Course> findAllBy(Pageable pageable);

    Page<Course> findAllByNameContainingIgnoreCase(String name, Pageable pageable);

    Page<Course>findAllByPrice( double price ,  Pageable pageable);

    Page<Course> findAllByNameIsContainingIgnoreCaseAndPrice( String name, double price, Pageable pageable);

 }