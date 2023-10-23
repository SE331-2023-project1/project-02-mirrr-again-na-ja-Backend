package com.example.pjcompo.dao;

import com.example.pjcompo.entity.Advisor;

import java.util.List;

public interface AdvisorDao {
    Integer getAdvisorSize();
    List<Advisor> getAdvisors(Integer pageSize, Integer page);
    Advisor getAdvisor(Long id);
}
