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
                .image("https://i.pinimg.com/originals/a2/3d/17/a23d17cae4eb6a8e402fd01edf61057b.jpg")
                .build()
        );
        //2
        studentRepository.save(Student.builder()
                .name("Sen")
                .surname("Kaibara")
                .course("Melee combat")
                .image("https://i.pinimg.com/originals/ed/87/82/ed8782d0d441f2d02bbe1430c720a521.jpg")
                .build()
        );
        //3
        studentRepository.save(Student.builder()
                .name("Togaru")
                .surname("Kamakiri")
                .course("Close Range Combat")
                .image("https://i.pinimg.com/originals/6d/d7/0b/6dd70b4ae470dc34b9291f837cb50e48.jpg")
                .build()
        );
        //4
        studentRepository.save(Student.builder()
                .name("Shihai")
                .surname("Kuroiro")
                .course("Melee,support combat")
                .image("https://i.pinimg.com/originals/0d/e7/1b/0de71be81f68d881b2b5310d449e0c5f.jpg")
                .build()
        );
        //5
        studentRepository.save(Student.builder()
                .name("Itsuka")
                .surname("Kendo")
                .course("Melee combat")
                .image("https://i.pinimg.com/originals/04/39/de/0439dee136c54893daaf3c22e2a4cf4c.jpg")
                .build()
        );
        //6
        studentRepository.save(Student.builder()
                .name("Yui")
                .surname("Kodai")
                .course("Long Ranged Combat")
                .image("https://i.pinimg.com/originals/4c/0d/71/4c0d718a468cf418e64534e4554eb138.png")
                .build()
        );
        //7
        studentRepository.save(Student.builder()
                .name("Kinoko")
                .surname("Komori")
                .course("Long Ranged Support")
                .image("https://i.pinimg.com/originals/f8/be/18/f8be186008ede1e1cff00c5da2df967b.jpg")
                .build()
        );
        //8
        studentRepository.save(Student.builder()
                .name("Mirio")
                .surname("Togata")
                .course("Melee combat")
                .image("https://i.pinimg.com/originals/6d/e4/07/6de407fd96ef24d458b614bd2bbbc9ae.jpg")
                .build()
        );
        //9
        studentRepository.save(Student.builder()
                .name("Hitoshi")
                .surname("Shinso")
                .course("Supportcombat,Mind control,Binding Cloth")
                .image("https://i.pinimg.com/originals/40/67/48/4067485792a111ce107be8675e5c0a4f.jpg")
                .build()
        );
        //10
        studentRepository.save(Student.builder()
                .name("Tamaki")
                .surname("Amajiki")
                .course("Melee,support combat")
                .image("https://i.pinimg.com/originals/7a/b8/49/7ab8499c64aedb4aba26081ba1ff26e8.jpg")
                .build()
        );
    }
}
