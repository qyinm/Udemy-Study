package com.hippoo.learnjpandhibernate.course;

import com.hippoo.learnjpandhibernate.course.jdbc.CourseJdbcRepository;
import com.hippoo.learnjpandhibernate.course.jpa.CourseJpaRepository;
import com.hippoo.learnjpandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJdbcRepository repository;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        repository.insert(new Course(1, "jpa aws", "s"));
//        repository.insert(new Course(2, "jpa docker", "s"));
//        repository.insert(new Course(3, "jpa azure", "s"));
        repository.save(new Course(1, "jpa aws", "s"));
        repository.save(new Course(2, "jpa docker", "s"));
        repository.save(new Course(3, "jpa azure", "s"));


        repository.deleteById(2L);

        System.out.println(repository.findById(1L));
        System.out.println(repository.findById(3L));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("s"));
        System.out.println(repository.findByName("jpa azure"));
    }
}
