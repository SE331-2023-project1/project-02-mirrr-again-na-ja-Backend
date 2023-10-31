package com.example.pjcompo.controller;

import com.example.pjcompo.entity.Student;
import com.example.pjcompo.service.StudentService;
import com.example.pjcompo.util.LabMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StudentController {
    final StudentService studentService;

    @GetMapping("student")
    public ResponseEntity<?> getEventLists(@RequestParam(value = "_limit",
            required = false)Integer perPage
            ,@RequestParam(value = "_page",required = false)Integer page) {
        Page<Student> pageOutput = studentService.getEvents(perPage, page);
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("x-total-count",
                String.valueOf(pageOutput.getTotalElements()));
        return new
                ResponseEntity<>(LabMapper.INSTANCE.getStudentDto(pageOutput.getContent()),responseHeader,HttpStatus.OK);
    }

    @GetMapping("student/{id}")
    public ResponseEntity<?> getEvent(@PathVariable("id") Long id){
        Student output = studentService.getEvent(id);
        if (output != null) {
            return ResponseEntity.ok(LabMapper.INSTANCE.getStudentDto(output));
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The given id is not found");
        }
    }

    @PostMapping("/student")
    public ResponseEntity<?> addStudent(@RequestBody Student student) {
        Student output = studentService.save(student);
        return ResponseEntity.ok(LabMapper.INSTANCE.getStudentDto(output));
    }
}
