package com.example.pjcompo.dao;

import com.example.pjcompo.entity.Advisor;
import com.example.pjcompo.repository.AdvisorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Profile("db")
public class AdvisorDaoDbImpl implements AdvisorDao{
    final AdvisorRepository advisorRepository;
    @Override
    public Integer getAdvisorSize(){
        return Math.toIntExact(advisorRepository.count());
    }

    @Override
    public Page<Advisor> getAdvisors(Integer pageSize, Integer page) {
        return advisorRepository.findAll(PageRequest.of(page - 1, pageSize));
    }

    @Override
    public Advisor getAdvisor(Long id) {
        return advisorRepository.findById(id).orElse(null);
    }

    @Override
    public Advisor save(Advisor advisor) {
        return advisorRepository.save(advisor);
    }
}
