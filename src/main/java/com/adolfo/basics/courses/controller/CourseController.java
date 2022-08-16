package com.adolfo.basics.courses.controller;

import com.adolfo.basics.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(new Course(1, "Learn MS", "Adolfo"),
                new Course(2, "Master Java", "Luigi"));
    }

    @GetMapping("/courses/1")
    public Course getCourseDetails(){
        return new Course(1, "Learn MS", "Adolfo");
    }
}
