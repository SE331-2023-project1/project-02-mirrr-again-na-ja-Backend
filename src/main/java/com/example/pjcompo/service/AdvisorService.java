package com.example.pjcompo.service;

import com.example.pjcompo.entity.Advisor;
import org.springframework.data.domain.Page;

import java.util.List;

public interface AdvisorService {
    Integer getAdvisorSize ();
    Page<Advisor> getAdvisors(Integer pageSize, Integer page);
    Advisor getAdvisor(Long id);
    Advisor save(Advisor advisor);
}
