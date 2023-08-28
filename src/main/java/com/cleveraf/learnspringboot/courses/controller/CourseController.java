package com.cleveraf.learnspringboot.courses.controller;

import com.cleveraf.learnspringboot.courses.bean.Course;
import com.cleveraf.learnspringboot.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository courseRepository; //acts as DB repository
    //http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        /*return Arrays.asList(
                new Course(1, "Learnn Spring", "cleverAf"),
                new Course(2, "Learnn Spring2", "cleverAf"),
                new Course(3, "Learnn Spring3", "cleverAf")
                );*/
        return courseRepository.findAll();
    }
    @GetMapping("/course/{id}")
    public Course getCourseById(@PathVariable long id) {
        Optional<Course> course = courseRepository.findById(id);
        if (course.isEmpty()) {
            throw new RuntimeException("Course not found!" + id);
        }
        return course.get();
        /*return Arrays.asList(
                new Course(1, "Learnn Spring", "cleverAf"));*/
    }

    @PostMapping("/course") //upload a new course
    public void createCourse(@RequestBody Course course) {
        courseRepository.save(course);
    }
    @PutMapping("/course/{id}") //Replace a  course
    public void updateCourse(@PathVariable long id,  @RequestBody Course course) {
        courseRepository.save(course);
    }
    @DeleteMapping("/course/{id}") //Replace a  course
    public void deleteCourse(@PathVariable long id) {
        courseRepository.deleteById(id);
    }
}
