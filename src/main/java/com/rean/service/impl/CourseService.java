package com.rean.service.impl;

import com.rean.model.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.Optional;

public interface CourseService {

    void create(CourseRequest courseRequest);

    void update(Long id, CourseRequest courseRequest);

    void delete(Long id);

    CourseResponse getById(Long id);

    List<CourseResponse> getAllCourses();

    CourseResponsePagination filterWithPagination(CourseFilterRequest filterRequest);
}
