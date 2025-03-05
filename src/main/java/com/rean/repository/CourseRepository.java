package com.rean.repository;

import com.rean.model.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import java.awt.print.Pageable;
import java.util.Optional;

public interface CourseRepository  extends JpaRepository<Course,Long> {

    //  Find by ID
    Optional<Course> findFirstById(Long id);

    //  Find All by Pageable
    Page<Course> findAllBy(Pageable pageable);

    //  Find Can be any text sting
    Page<Course> findAllByNameContainingIgnoreCase(String name, Pageable pageable);

    Page<Course>findAllByPrice( double price ,  Pageable pageable);

    Page<Course> findAllByNameContainingIgnoreCaseAndPrice( String name, double price, Pageable pageable);

 }