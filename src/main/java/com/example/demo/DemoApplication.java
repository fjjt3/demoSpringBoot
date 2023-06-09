package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
    // check white label error
    @GetMapping
    public List<Student> hello() {
      return List.of(
        new Student(
          id:1L,
          name:"Marian",
          email:"mariam.jamal@gmail.com",
          LocalDate.of(year:2000, Month.JANUARY, dayOfMonth:5),
          age:23

        )
    );
    }
  }
}
