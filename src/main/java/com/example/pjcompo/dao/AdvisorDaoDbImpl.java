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

        long totalEvents = advisorRepository.count();
        // If pageSize is null, set it to the total number of events.
        pageSize = pageSize == null ? (int) totalEvents : pageSize;

        // If page is null, default to fetching the first page.
        page = page == null ? 0 : page - 1; // Convert to 0-based for Spring's PageRequest.

        // Use the PageRequest object to fetch the desired page of events from the database.
        return advisorRepository.findAll(PageRequest.of(page, pageSize));
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
