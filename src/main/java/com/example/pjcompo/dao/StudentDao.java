package com.example.pjcompo.dao;

import com.example.pjcompo.entity.Student;

import java.util.List;

public interface StudentDao {
    Integer getEventSize();
    List<Student> getEvents(Integer pageSize, Integer page);
    Student getEvent(Number id);
}
