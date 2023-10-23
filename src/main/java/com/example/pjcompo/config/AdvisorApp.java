package com.example.pjcompo.config;

import com.example.pjcompo.entity.Advisor;
import com.example.pjcompo.repository.AdvisorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AdvisorApp implements ApplicationListener<ApplicationReadyEvent> {
    final AdvisorRepository advisorRepository;
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        //1
        advisorRepository.save(Advisor.builder()
                .name("Nemuri")
                .surname("Kayama")
                .image("https://i.pinimg.com/originals/44/c9/c7/44c9c71162642ace8e3fe4bd79e9b2f9.jpg")
                .build()
        );
        //2
        advisorRepository.save(Advisor.builder()
                .name("Yu")
                .surname("Takeyama")
                .image("https://i.pinimg.com/originals/18/a5/fa/18a5facbae3db807b103146d784a5d71.jpg")
                .build()
        );
        //3
        advisorRepository.save(Advisor.builder()
                .name("Sorahiko")
                .surname("Torino")
                .image("https://i.pinimg.com/originals/12/46/aa/1246aa6a3e6f4c5a12f43257ecd227e2.jpg")
                .build()
        );
        //4
        advisorRepository.save(Advisor.builder()
                .name("Enji")
                .surname("Todoroki")
                .image("https://i.pinimg.com/originals/9b/62/6f/9b626f08cdfd242fcaa9b34470ad323f.jpg")
                .build()
        );
        //5
        advisorRepository.save(Advisor.builder()
                .name("Anan")
                .surname("Kurose")
                .image("https://i.pinimg.com/originals/b0/fe/28/b0fe28767e7a68d22eeaa38b9e287b20.jpg")
                .build()
        );
        //6
        advisorRepository.save(Advisor.builder()
                .name("Hizashi")
                .surname("Yamada")
                .image("https://i.pinimg.com/originals/4e/8f/22/4e8f22d17f6dfd0eac6dbdf822eb4d9c.jpg")
                .build()
        );


    }


}
