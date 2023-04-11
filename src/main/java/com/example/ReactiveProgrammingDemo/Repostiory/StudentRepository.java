package com.example.ReactiveProgrammingDemo.Repostiory;

import com.example.ReactiveProgrammingDemo.Model.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface StudentRepository extends ReactiveCrudRepository<Student, Integer> {

}
