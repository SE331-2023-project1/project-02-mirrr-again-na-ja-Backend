package com.example.pjcompo.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    Long id;
    String name;
    String surname;
    String course;
    String image;
    Long advisorID;
}
