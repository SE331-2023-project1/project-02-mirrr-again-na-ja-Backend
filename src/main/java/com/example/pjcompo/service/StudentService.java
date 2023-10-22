package com.example.pjcompo.service;

import com.example.pjcompo.entity.Student;

import java.util.List;

public interface StudentService {
    Integer getEventSize();
    List<Student> getEvents(Integer pageSize, Integer page);
    Student getEvent(Long id);
}
