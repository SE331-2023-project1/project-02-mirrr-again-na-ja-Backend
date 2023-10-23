package com.example.pjcompo.service;

import com.example.pjcompo.dao.AdvisorDao;
import com.example.pjcompo.entity.Advisor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdvisorServiceImpl implements AdvisorService{
    final AdvisorDao advisorDao;
    @Override
    public Integer getAdvisorSize () {
        return advisorDao.getAdvisorSize();
    }

    @Override
    public Page<Advisor> getAdvisors(Integer pageSize, Integer page){
        return advisorDao.getAdvisors(pageSize, page);
    }

    @Override
    public Advisor getAdvisor(Long id) {
        return  advisorDao.getAdvisor(id);
    }

    @Override
    public Advisor save(Advisor advisor){
        return advisorDao.save(advisor);
    }
}
