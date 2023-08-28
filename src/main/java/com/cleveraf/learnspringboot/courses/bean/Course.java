package com.cleveraf.learnspringboot.courses.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity (name = "Course")
public class Course {
    @Id
    @GeneratedValue
    private long id;
    //@Column(name = "course_name")
    private String name;
    private String author;

    public Course() { //empty constructor is mandatory for an entity
    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Course id: " + id + " name: " + name + " author: " + author;
    }
}
