package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner cmd(StudentRepository studentRepository) {
        return args -> {
            Student john = new Student("John", "John", "jhon@jhon.com", 25);
            studentRepository.save(john);
        };
    }

}
