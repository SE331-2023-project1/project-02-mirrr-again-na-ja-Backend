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
        advisorRepository.save(Advisor.builder()
                .name("Nemuri")
                .surname("Kayama")
                .image("https://static.wikia.nocookie.net/bokunoheroacademia/images/1/1e/Midnight_Anime_Portrait.png/revision/latest/scale-to-width-down/135?cb=20200401121928")
                .build()
        );
        advisorRepository.save(Advisor.builder()
                .name("Yu")
                .surname("Takeyama")
                .image("https://static.wikia.nocookie.net/bokunoheroacademia/images/d/db/Mt._Lady_Anime_Portrait.png/revision/latest/scale-to-width-down/135?cb=20200321204446")
                .build()
        );
        advisorRepository.save(Advisor.builder()
                .name("Sorahiko")
                .surname("Torino")
                .image("https://static.wikia.nocookie.net/bokunoheroacademia/images/7/77/Gran_Torino_Anime_Portrait.png/revision/latest/scale-to-width-down/135?cb=20180503181559")
                .build()
        );
    }


}
