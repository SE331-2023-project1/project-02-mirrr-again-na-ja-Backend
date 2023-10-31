package com.example.pjcompo.dto;

import com.example.pjcompo.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    Long id;
    String name;
    String surname;
    String course;
    String image;
    Long advisorID;
    StudentAdvisorDTO advisor;
}
