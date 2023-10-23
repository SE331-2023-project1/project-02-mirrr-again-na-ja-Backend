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

        long totalEvents = studentRepository.count();
        // If pageSize is null, set it to the total number of events.
        pageSize = pageSize == null ? (int) totalEvents : pageSize;

        // If page is null, default to fetching the first page.
        page = page == null ? 0 : page - 1; // Convert to 0-based for Spring's PageRequest.

        // Use the PageRequest object to fetch the desired page of events from the database.
        return studentRepository.findAll(PageRequest.of(page, pageSize));
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
