package com.hippoo.learnspringboot;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return List.of(
                new Course(1, "Learn AWS", "inflearn"),
                new Course(2, "Learn DevOps", "udemy"),
                new Course(1, "Learn Azure", "solo"));
    }
}
