package com.hippoo.learnjpandhibernate.course.jdbc;

import com.hippoo.learnjpandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "aws", "s"));
        repository.insert(new Course(2, "docker", "s"));
        repository.insert(new Course(3, "azure", "s"));

        repository.deleteById(2L);

        System.out.println(repository.findById(1));
        System.out.println(repository.findById(3));
    }
}
