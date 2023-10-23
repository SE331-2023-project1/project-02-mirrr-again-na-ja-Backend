package com.example.pjcompo.service;

import com.example.pjcompo.entity.Student;
import org.springframework.data.domain.Page;

import java.util.List;

public interface StudentService {
    Integer getEventSize();
    Page<Student> getEvents(Integer pageSize, Integer page);
    Student getEvent(Long id);
    Student save(Student student);
}
