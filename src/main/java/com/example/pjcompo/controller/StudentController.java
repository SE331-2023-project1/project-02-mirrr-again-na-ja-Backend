package com.example.pjcompo.controller;

import com.example.pjcompo.entity.Student;
import com.example.pjcompo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
        List<Student> output = null;
        Integer studentSize = studentService.getEventSize();
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("x-total-count", String.valueOf(studentSize));
        try {
            output = studentService.getEvents(perPage, page);
            return new ResponseEntity<>(output, responseHeader, HttpStatus.OK);
        } catch (IndexOutOfBoundsException ex) {
            return new ResponseEntity<>(output, responseHeader, HttpStatus.OK);
        }
    }

    @GetMapping("student/{id}")
    public ResponseEntity<?> getEvent(@PathVariable("id") Long id){
        Student output = studentService.getEvent(id);
        if (output != null) {
            return ResponseEntity.ok(output);
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "The given id is not found");
        }
    }
}
