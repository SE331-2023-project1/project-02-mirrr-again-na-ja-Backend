package com.example.pjcompo.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Advisor {
    Long id;
    String name;
    String surname;
    String image;
}
