package com.example.pjcompo.config;

import com.example.pjcompo.entity.Advisor;
import com.example.pjcompo.entity.Student;
import com.example.pjcompo.repository.AdvisorRepository;
import com.example.pjcompo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    final StudentRepository studentRepository;
    final AdvisorRepository advisorRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        Student student1, student2, student3, student4, student5, student6, student7, student8, student9, student10;
        Advisor advisor1, advisor2, advisor3, advisor4, advisor5, advisor6;

        advisor1 = advisorRepository.save(Advisor.builder()
                .name("Nemuri")
                .surname("Kayama")
                .image("https://i.pinimg.com/originals/44/c9/c7/44c9c71162642ace8e3fe4bd79e9b2f9.jpg")
                .build());
        advisor2 = advisorRepository.save(Advisor.builder()
                .name("Yu")
                .surname("Takeyama")
                .image("https://i.pinimg.com/originals/18/a5/fa/18a5facbae3db807b103146d784a5d71.jpg")
                .build());
        advisor3 = advisorRepository.save(Advisor.builder()
                .name("Sorahiko")
                .surname("Torino")
                .image("https://i.pinimg.com/originals/12/46/aa/1246aa6a3e6f4c5a12f43257ecd227e2.jpg")
                .build());
        advisor4 = advisorRepository.save(Advisor.builder()
                .name("Enji")
                .surname("Todoroki")
                .image("https://i.pinimg.com/originals/9b/62/6f/9b626f08cdfd242fcaa9b34470ad323f.jpg")
                .build());
        advisor5 = advisorRepository.save(Advisor.builder()
                .name("Anan")
                .surname("Kurose")
                .image("https://i.pinimg.com/originals/b0/fe/28/b0fe28767e7a68d22eeaa38b9e287b20.jpg")
                .build());
        advisor6 = advisorRepository.save(Advisor.builder()
                .name("Hizashi")
                .surname("Yamada")
                .image("https://i.pinimg.com/originals/4e/8f/22/4e8f22d17f6dfd0eac6dbdf822eb4d9c.jpg")
                .build());

        //1
        student1 = studentRepository.save(Student.builder()
                .name("Yosetsu")
                .surname("Awase")
                .course("Support combat")
                .image("https://i.pinimg.com/originals/a2/3d/17/a23d17cae4eb6a8e402fd01edf61057b.jpg")
                .build()
        );
        student1.setAdvisor(advisor1);
        advisor1.getStudents().add(student1);
        //2
        student2 = studentRepository.save(Student.builder()
                .name("Sen")
                .surname("Kaibara")
                .course("Melee combat")
                .image("https://i.pinimg.com/originals/ed/87/82/ed8782d0d441f2d02bbe1430c720a521.jpg")
                .build()
        );
        student2.setAdvisor(advisor1);
        advisor1.getStudents().add(student1);
        //3
        student3 = studentRepository.save(Student.builder()
                .name("Togaru")
                .surname("Kamakiri")
                .course("Close Range Combat")
                .image("https://i.pinimg.com/originals/6d/d7/0b/6dd70b4ae470dc34b9291f837cb50e48.jpg")
                .build()
        );
        student3.setAdvisor(advisor2);
        advisor2.getStudents().add(student3);
        //4
        student4 = studentRepository.save(Student.builder()
                .name("Shihai")
                .surname("Kuroiro")
                .course("Melee,support combat")
                .image("https://i.pinimg.com/originals/0d/e7/1b/0de71be81f68d881b2b5310d449e0c5f.jpg")
                .build()
        );
        student4.setAdvisor(advisor2);
        advisor2.getStudents().add(student4);
        //5
        student5 = studentRepository.save(Student.builder()
                .name("Itsuka")
                .surname("Kendo")
                .course("Melee combat")
                .image("https://i.pinimg.com/originals/04/39/de/0439dee136c54893daaf3c22e2a4cf4c.jpg")
                .build()
        );
        student5.setAdvisor(advisor3);
        advisor3.getStudents().add(student5);
        //6
        student6 = studentRepository.save(Student.builder()
                .name("Yui")
                .surname("Kodai")
                .course("Long Ranged Combat")
                .image("https://i.pinimg.com/originals/4c/0d/71/4c0d718a468cf418e64534e4554eb138.png")
                .build()
        );
        student6.setAdvisor(advisor3);
        advisor3.getStudents().add(student6);
        //7
        student7 = studentRepository.save(Student.builder()
                .name("Kinoko")
                .surname("Komori")
                .course("Long Ranged Support")
                .image("https://i.pinimg.com/originals/f8/be/18/f8be186008ede1e1cff00c5da2df967b.jpg")
                .build()
        );
        student7.setAdvisor(advisor4);
        advisor4.getStudents().add(student7);
        //8
        student8 = studentRepository.save(Student.builder()
                .name("Mirio")
                .surname("Togata")
                .course("Melee combat")
                .image("https://i.pinimg.com/originals/6d/e4/07/6de407fd96ef24d458b614bd2bbbc9ae.jpg")
                .build()
        );
        student8.setAdvisor(advisor4);
        advisor4.getStudents().add(student8);
        //9
        student9 = studentRepository.save(Student.builder()
                .name("Hitoshi")
                .surname("Shinso")
                .course("Supportcombat,Mind control,Binding Cloth")
                .image("https://i.pinimg.com/originals/40/67/48/4067485792a111ce107be8675e5c0a4f.jpg")
                .build()
        );
        student9.setAdvisor(advisor5);
        advisor5.getStudents().add(student9);
        //10
        student10 = studentRepository.save(Student.builder()
                .name("Tamaki")
                .surname("Amajiki")
                .course("Melee,support combat")
                .image("https://i.pinimg.com/originals/7a/b8/49/7ab8499c64aedb4aba26081ba1ff26e8.jpg")
                .build()
        );
        student10.setAdvisor(advisor6);
        advisor6.getStudents().add(student10);
    }
}
