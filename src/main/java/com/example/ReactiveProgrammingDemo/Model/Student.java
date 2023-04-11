package com.example.ReactiveProgrammingDemo.Model;
import lombok.*;
import org.springframework.data.annotation.Id;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    private Integer id;
    private String name;
}
