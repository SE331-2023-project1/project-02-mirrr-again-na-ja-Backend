package com.example.pjcompo.service;

import com.example.pjcompo.dao.StudentDao;
import com.example.pjcompo.entity.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    final StudentDao studentDao;

    @Override
    public Integer getEventSize() {
        return studentDao.getEventSize();
    }

    @Override
    public Page<Student> getEvents(Integer pageSize, Integer page) {
        return studentDao.getEvents(pageSize, page);
    }

    @Override
    public Student getEvent(Long id) {
        return studentDao.getEvent(id);
    }

    @Override
    public Student save(Student student){
        return studentDao.save(student);
    }
}
