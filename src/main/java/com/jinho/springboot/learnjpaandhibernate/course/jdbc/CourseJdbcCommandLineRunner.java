package com.jinho.springboot.learnjpaandhibernate.course.jdbc;

import com.jinho.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    private final CourseJdbcRepository repository;

    public CourseJdbcCommandLineRunner(CourseJdbcRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Java", "Jinho"));
        repository.insert(new Course(2, "Azure", "Jinho"));
        repository.insert(new Course(3, "DevOps", "Jinho"));
        repository.insert(new Course(4, "AWS", "Jinho"));

        repository.deleteById(1);
    }
}
