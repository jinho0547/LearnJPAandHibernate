package com.jinho.springboot.learnjpaandhibernate.course;

import com.jinho.springboot.learnjpaandhibernate.course.jpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//    private CourseJpaRepository repository;
//    @Autowired
//    private CourseJdbcRepository repository;
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Java", "Jinho"));
        repository.save(new Course(2, "Azure", "Han"));
        repository.save(new Course(3, "DevOps", "Jinho"));
        repository.save(new Course(4, "AWS", "Han"));
        repository.save(new Course(4, "Spring", "Jinho"));

        repository.deleteById(1l);
        System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("Jinho"));
        System.out.println(repository.findByName("Spring"));
    }
}
