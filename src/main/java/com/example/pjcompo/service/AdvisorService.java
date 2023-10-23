package com.example.pjcompo.service;

import com.example.pjcompo.entity.Advisor;

import java.util.List;

public interface AdvisorService {
    Integer getAdvisorSize ();
    List<Advisor> getAdvisors(Integer pageSize,Integer page);
    Advisor getAdvisor(Long id);
}
