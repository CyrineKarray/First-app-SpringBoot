package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
              Student student1 = new Student(
                    "maria",
                    "cyrine@gmail.com",
                    LocalDate.of(1997, Month.NOVEMBER,11)
            );
            Student bob = new Student(
                    "bob",
                    "bob@gmail.com",
                    LocalDate.of(1997, Month.NOVEMBER,10)
            );
            repository.saveAll(
                    List.of(student1, bob)
            );
        };
    }
}
