package se331.lab.rest.config;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import se331.lab.rest.entity.Advisor;
import se331.lab.rest.entity.Comment;
import se331.lab.rest.entity.HistoryComment;
import se331.lab.rest.entity.Student;
import se331.lab.rest.repository.AdvisorRepository;
import se331.lab.rest.repository.CommentRepository;
import se331.lab.rest.repository.HistoryCommentRepository;
import se331.lab.rest.repository.StudentRepository;
import se331.lab.rest.security.user.Role;
import se331.lab.rest.security.user.User;
import se331.lab.rest.security.user.UserRepository;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Component
@RequiredArgsConstructor
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    final AdvisorRepository advisorRepository;
    final StudentRepository studentRepository;
    final UserRepository userRepository;
    final HistoryCommentRepository historyCommentRepository;
    final CommentRepository commentRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent){

        Advisor advisor1,advisor2,advisor3,advisor4,advisor5,advisor6;
        HistoryComment hist1;
        Comment c1, c2, c3;
        advisor1 = advisorRepository.save(Advisor
                .builder()
                .name("Toshinori")
                .surname("Yagi")
                .department("Foundational Hero Studies")
                .position("Professor")
                .advisorID("A01")
                .image(List.of("https://i.pinimg.com/564x/8e/77/56/8e7756e78dca420e5bff8d0ea34ed645.jpg"))
                .announcements(List.of("https://miro.medium.com/v2/resize:fit:900/1*v4RzJC1ufpxcQWOOhBitPA.jpeg","https://storage.googleapis.com/download/storage/v1/b/projectstorage-165a3.appspot.com/o/2023-10-29%20233234164-953321_721.pdf?generation=1698597162648926&alt=media"))
                .build());
        advisor2 = advisorRepository.save(Advisor.builder()
                .name("Shoto")
                .surname("Aizawa")
                .department("Battle")
                .position("Associate Professor")
                .advisorID("A02")
                .image(List.of("https://i.pinimg.com/564x/72/eb/cf/72ebcfec46cf8bc1f1ae906ad9413412.jpg"))
                .build());
        advisor3 = advisorRepository.save(Advisor.builder()
                .name("Keigo")
                .surname("Takami")
                .department("Science")
                .position("Lecturer")
                .advisorID("A03")
                .image(List.of("https://i.pinimg.com/564x/5a/5c/f3/5a5cf366a2e2e2c939be40b2b5c775b6.jpg"))
                .build());

        advisor4 = advisorRepository.save(Advisor.builder()
                .name("Sorahiko")
                .surname("Torino")
                .department("Mathematics")
                .position("Professor")
                .advisorID("A04")
                .image(List.of("https://i.pinimg.com/originals/12/46/aa/1246aa6a3e6f4c5a12f43257ecd227e2.jpg"))
                .build());

        advisor5 = advisorRepository.save(Advisor.builder()
                .name("Anan")
                .surname("Kurose")
                .department("History")
                .position("Lecturer")
                .advisorID("A05")
                .image(List.of("https://i.pinimg.com/originals/b0/fe/28/b0fe28767e7a68d22eeaa38b9e287b20.jpg"))
                .build());
        advisor6 = advisorRepository.save(Advisor.builder()
                .name("Hizashi")
                .surname("Yamada")
                .department("English")
                .position("Lecturer")
                .advisorID("A06")
                .image(List.of("https://i.pinimg.com/originals/4e/8f/22/4e8f22d17f6dfd0eac6dbdf822eb4d9c.jpg"))
                .build());

        Student student1,student2,student3,student4,student5,student6,student7,student8,student9,student10;
        student1 = studentRepository.save(Student.builder()
                .studentID("S01")
                .name("Yuga")
                .surname("Aoyama")
                .department("History, Science")
                .image(List.of("https://shorturl.asia/Enujr"))
                .build());
        student1.setAdvisor(advisor3);
        advisor3.getStudentList().add(student1);


        student2 = studentRepository.save(Student.builder()
                .studentID("S02")
                .name("Mina")
                .surname("Ashido")
                .department("Science")
                .image(List.of("https://shorturl.asia/f61bX"))
                .build());
        student2.setAdvisor(advisor5);
        advisor5.getStudentList().add(student2);

        student3 = studentRepository.save(Student.builder()
                .studentID("S03")
                .name("Tsuyu")
                .surname("Asui")
                .department("History, Mathematics")
                .image(List.of("https://shorturl.asia/ZBTEJ"))
                .build());
        student3.setAdvisor(advisor5);
        advisor5.getStudentList().add(student3);

        student4 = studentRepository.save(Student.builder()
                .studentID("S04")
                .name("Tenya")
                .surname("Ida")
                .department("Foundational Hero Studies")
                .image(List.of("https://shorturl.asia/TxJpl"))
                .build());
        student4.setAdvisor(advisor4);
        advisor4.getStudentList().add(student4);

        student5 = studentRepository.save(Student.builder()
                .studentID("S05")
                .name("Ochaco")
                .surname("Uraraka")
                .department("History")
                .image(List.of("https://shorturl.asia/osAWh"))
                .build());
        student5.setAdvisor(advisor6);
        advisor6.getStudentList().add(student5);

        student6 = studentRepository.save(Student.builder()
                .studentID("S06")
                .name("Shoto")
                .surname("Todoroki")
                .department("Science, Battle")
                .image(List.of("https://shorturl.asia/X2iWE"))
                .build());
        student6.setAdvisor(advisor6);
        advisor6.getStudentList().add(student6);

        student7 = studentRepository.save(Student.builder()
                .studentID("S07")
                .name("Katsuki")
                .surname("Bakugo")
                .department("Battle, Mathematics")
                .image(List.of("https://shorturl.asia/f8MWV"))
                .build());
        student7.setAdvisor(advisor1);
        advisor1.getStudentList().add(student7);

        student8 = studentRepository.save(Student.builder()
                .studentID("S08")
                .name("Izuku")
                .surname("Midoriya")
                .department("Foundational Hero Studies, Battle")
                .image(List.of("https://shorturl.asia/s24Lq"))
                .build());
        student8.setAdvisor(advisor1);
        advisor1.getStudentList().add(student8);

        student9 = studentRepository.save(Student.builder()
                .studentID("S09")
                .name("Denki")
                .surname("Kaminari")
                .department("Science")
                .image(List.of("https://shorturl.asia/K1XNM"))
                .build());
        student9.setAdvisor(advisor5);
        advisor5.getStudentList().add(student9);

        student10 = studentRepository.save(Student.builder()
                .studentID("S10")
                .name("Eijiro")
                .surname("Kirishima")
                .department("English")
                .image(List.of("https://shorturl.asia/5dFLt"))
                .build());
        student10.setAdvisor(advisor2);
        advisor2.getStudentList().add(student10);

        addUser();
        //admin
        advisor1.setUser(user1);
        user1.setAdvisor(advisor1);
        //advisor
        advisor2.setUser(user2);
        user2.setAdvisor(advisor2);
        //student
        student8.setUser(user3);
        user3.setStudent(student8);
        //advisor
        user5.setAdvisor(advisor3);
        advisor3.setUser(user5);

        student1.setUser(user4);
        user4.setStudent(student1);

        student3.setUser(user6);
        user6.setStudent(student3);

        hist1 = historyCommentRepository.save(HistoryComment.builder()
                .studentId(student1.getId())
                .advisorId(advisor2.getId())
                .build());
        c1 = commentRepository.save(Comment.builder()
                .text("Hello World")
                .sentByAdvisor(true)
                .build());
        c1.setHistory(hist1);
        hist1.getCommentHistory().add(c1);
        c2 = commentRepository.save(Comment.builder()
                .text("Hello Prof")
                .sentByAdvisor(false)
                .build());
        c2.setHistory(hist1);
        hist1.getCommentHistory().add(c2);
        c3 = commentRepository.save(Comment.builder()
                .text("Don't do that")
                .sentByAdvisor(true)
                .build());
        c3.setHistory(hist1);
        hist1.getCommentHistory().add(c3);


    }
    User user1,user2,user3,user4,user5,user6;
    private void addUser() {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        user1 = User.builder()
                .username("admin")
                .password(encoder.encode("admin"))
                .name("admin")
                .surname("admin")
                .email("admin@admin.com")
                .enabled(true)
                .lastPasswordResetDate(Date.from(LocalDate.of(2021, 01, 01).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .build();
        user2 = User.builder()
                .username("advisor")
                .password(encoder.encode("advisor"))
                .name("advisor")
                .surname("advisor")
                .email("advisor@user.com")
                .enabled(true)
                .lastPasswordResetDate(Date.from(LocalDate.of(2021, 01, 01).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .build();
        user3 = User.builder()
                .username("student")
                .password(encoder.encode("student"))
                .name("student")
                .surname("student")
                .email("student@user.com")
                .enabled(true)
                .lastPasswordResetDate(Date.from(LocalDate.of(2021, 01, 01).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .build();
        user4 = User.builder()
                .username("student1")
                .password(encoder.encode("student1"))
                .enabled(true)
                .lastPasswordResetDate(Date.from(LocalDate.of(2021, 01, 01).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .build();
        user5 = User.builder()
                .username("advisor1")
                .password(encoder.encode("advisor1"))
                .enabled(true)
                .lastPasswordResetDate(Date.from(LocalDate.of(2021, 01, 01).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .build();
        user6 = User.builder()
                .username("student3")
                .password(encoder.encode("student3"))
                .enabled(true)
                .lastPasswordResetDate(Date.from(LocalDate.of(2021, 01, 01).atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .build();



        user1.getRoles().add(Role.ROLE_ADMIN);
        userRepository.save(user1);

        user2.getRoles().add(Role.ROLE_ADVISOR);
        userRepository.save(user2);

        user3.getRoles().add(Role.ROLE_STUDENT);
        userRepository.save(user3);

        user4.getRoles().add(Role.ROLE_STUDENT);
        userRepository.save(user4);

        user5.getRoles().add(Role.ROLE_ADVISOR);
        userRepository.save(user5);

        user6.getRoles().add(Role.ROLE_STUDENT);
        userRepository.save(user6);
    }
}