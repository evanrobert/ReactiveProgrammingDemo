package com.example.ReactiveProgrammingDemo.Config;

import com.example.ReactiveProgrammingDemo.Repostiory.StudentRepository;
import com.example.ReactiveProgrammingDemo.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final StudentRepository studentRepository;
    private final StudentService studentService;

    @EventListener(ApplicationReadyEvent.class)
    public void ready() {
        this.studentRepository
                .deleteAll()
                //Bill has been made lowercase to produce the "saveAll is Name valid"
                .thenMany(studentService.saveAll("Evan", "Ji", "Harry", "Ryan", "Rick", "Chuck","Bill"))
                .thenMany(studentService.getAllStudents())
                .subscribe(s -> System.out.println(s.getName()));
    }
}
