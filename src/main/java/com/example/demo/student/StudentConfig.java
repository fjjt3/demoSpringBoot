package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {
  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository){
    return args -> {
      new Student marian = new Student(
        name = "Marian",
        email = "mariam.jamal@gmail.com",
        LocalDate.of(year = 2000, JANUARY, dayOfMonth = 5),
      );
      new Student alex = new Student(
        name = "Alex",
        email = "alex@gmail.com",
        LocalDate.of(year = 2005, JANUARY, dayOfMonth = 5),
      );

      repository.saveAll(
        List.of(marian, alex)
      );
    };



    };
  }

