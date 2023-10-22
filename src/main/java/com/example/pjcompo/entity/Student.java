package com.example.pjcompo.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
    Number id;
    String name;
    String surname;
    String course;
    String image;
    Number advisorID;
}
