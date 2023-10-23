package com.example.pjcompo.dao;

import com.example.pjcompo.entity.Advisor;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Profile("manual")
public class AdvisorDaoImpl implements AdvisorDao{
    List<Advisor> advisorList;

    @PostConstruct
    public void init() {
        advisorList = new ArrayList<>();
        //Advisor 1
        advisorList.add(Advisor.builder()
                .id(1L)
                .name("Toshinori")
                .surname("Yagi")
                .image("https://i.pinimg.com/564x/8e/77/56/8e7756e78dca420e5bff8d0ea34ed645.jpg")
                .build()
        );
        //Advisor 2
        advisorList.add(Advisor.builder()
                .id(2L)
                .name("Shoto")
                .surname("Aizawa")
                .image("https://i.pinimg.com/564x/72/eb/cf/72ebcfec46cf8bc1f1ae906ad9413412.jpg")
                .build()
        );
        //Advisor 3
        advisorList.add(Advisor.builder()
                .id(3L)
                .name("Keigo")
                .surname("Takami")
                .image("https://i.pinimg.com/564x/5a/5c/f3/5a5cf366a2e2e2c939be40b2b5c775b6.jpg")
                .build()
        );
    }

    @Override
    public Integer getAdvisorSize() {
        return advisorList.size();
    }

    @Override
    public Page<Advisor> getAdvisors(Integer pageSize, Integer page) {
      pageSize = pageSize == null ? advisorList.size() : pageSize;
      page = page == null ? 1 : page;
      int firstIndex = (page - 1) * pageSize;
      return new
              PageImpl<Advisor>(advisorList.subList(firstIndex,firstIndex+pageSize), PageRequest.of(page,
              pageSize),advisorList.size());
    }

    @Override
    public Advisor  getAdvisor(Long id) {
        return advisorList.stream().filter(advisor ->
                advisor.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public Advisor save(Advisor advisor) {
        advisor.setId(advisorList.get(advisorList.size()-1).getId()+1);
        advisorList.add(advisor);
        return advisor;
    }
}
