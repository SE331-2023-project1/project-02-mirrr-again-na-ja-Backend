package com.example.pjcompo.repository;

import com.example.pjcompo.entity.Advisor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdvisorRepository extends JpaRepository<Advisor,Long> {
    List<Advisor> findAll();
}
