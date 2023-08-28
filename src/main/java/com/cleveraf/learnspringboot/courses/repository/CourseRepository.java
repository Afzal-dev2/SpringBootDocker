package com.cleveraf.learnspringboot.courses.repository;

import com.cleveraf.learnspringboot.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
