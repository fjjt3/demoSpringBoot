package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
  public List<Student> getStudents() {
    return List.of(
      new Student(
        id = 1L,
        name = "Marian",
        email = "mariam.jamal@gmail.com",
        LocalDate.of(year = 2000, Month.JANUARY, dayOfMonth = 5),
        age = 23

      )
    );
  }

}
