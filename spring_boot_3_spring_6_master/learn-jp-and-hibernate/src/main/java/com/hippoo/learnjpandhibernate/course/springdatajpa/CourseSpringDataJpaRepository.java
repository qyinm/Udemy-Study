package com.hippoo.learnjpandhibernate.course.springdatajpa;

import com.hippoo.learnjpandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
