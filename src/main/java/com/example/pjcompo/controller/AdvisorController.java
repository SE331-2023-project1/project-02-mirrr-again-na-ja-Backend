package com.example.pjcompo.controller;

import com.example.pjcompo.entity.Advisor;
import com.example.pjcompo.service.AdvisorService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class AdvisorController {
    final AdvisorService advisorService;

    @GetMapping("advisor")
    public ResponseEntity<?> getAdvisorLists(@RequestParam(value = "_limit",required = false)Integer perPage
                                            ,@RequestParam(value = "_page",required = false)Integer page){
        Page<Advisor> pageOutput = advisorService.getAdvisors(perPage, page);
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.set("x-total-count",String.valueOf(pageOutput.getTotalElements()));
        return new ResponseEntity<>(pageOutput.getContent(),responseHeader,HttpStatus.OK);
    }

    @GetMapping("advisor/{id}")
    public ResponseEntity<?> getAdvisor(@PathVariable("id") Long id)  {
        Advisor output = advisorService.getAdvisor(id);
        if (output != null) {
            return ResponseEntity.ok(output);
        }else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"The given id is not found");
        }
    }

    @PostMapping("/advisor")
    public ResponseEntity<?> addAdvisor(@RequestBody Advisor advisor) {
        Advisor output = advisorService.save(advisor);
        return ResponseEntity.ok(output);
    }
}
