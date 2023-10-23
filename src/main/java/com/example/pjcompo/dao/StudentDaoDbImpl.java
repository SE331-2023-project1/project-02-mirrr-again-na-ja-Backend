package com.example.pjcompo.dao;

import com.example.pjcompo.entity.Student;
import com.example.pjcompo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Profile("db")
public class StudentDaoDbImpl implements StudentDao{
    final StudentRepository studentRepository;
    @Override
    public Integer getEventSize() {
        return Math.toIntExact(studentRepository.count());
    }

    @Override
    public Page<Student> getEvents(Integer pageSize, Integer page) {
        return studentRepository.findAll(PageRequest.of(page - 1, pageSize));
    }

    @Override
    public Student getEvent(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
