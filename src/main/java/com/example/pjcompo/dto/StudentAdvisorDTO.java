package com.example.pjcompo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentAdvisorDTO {
    Long id;
    String name;
    String surname;
    String image;
}
