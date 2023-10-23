package com.example.pjcompo.config;

import com.example.pjcompo.entity.Student;
import com.example.pjcompo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    final StudentRepository studentRepository;
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        //1
        studentRepository.save(Student.builder()
                .name("Yosetsu")
                .surname("Awase")
                .course("Support combat")
                .image("https://static.wikia.nocookie.net/bokunoheroacademia/images/e/e6/Yosetsu_Awase_Portrait.png/revision/latest/scale-to-width-down/135?cb=20181125070427")
                .build()
        );
        //2
        studentRepository.save(Student.builder()
                .name("Sen")
                .surname("Kaibara")
                .course("Melee combat")
                .image("https://static.wikia.nocookie.net/bokunoheroacademia/images/b/b2/Sen_Kaibara_Portrait.png/revision/latest/scale-to-width-down/135?cb=20181125070109")
                .build()
        );
        //3
        studentRepository.save(Student.builder()
                .name("Togaru")
                .surname("Kamakiri")
                .course("Close Range Combat")
                .image("https://static.wikia.nocookie.net/bokunoheroacademia/images/1/1a/Togaru_Kamakiri_Portrait.png/revision/latest/scale-to-width-down/135?cb=20181125070743")
                .build()
        );
    }
}
