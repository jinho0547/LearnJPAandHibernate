package com.jinho.springboot.learnjpaandhibernate.course;

import com.jinho.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.jinho.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJpaRepository repository;
//    @Autowired
//    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Java", "Jinho"));
        repository.insert(new Course(2, "Azure", "Jinho"));
        repository.insert(new Course(3, "DevOps", "Jinho"));
        repository.insert(new Course(4, "AWS", "Jinho"));

        repository.deleteById(1);
        System.out.println(repository.findById(3));


    }
}
